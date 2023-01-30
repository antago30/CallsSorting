package sorter;

import dao.callDao.CallsDao;
import dao.institutionsDAO.Institution;
import dao.institutionsDAO.InstitutionDao;

import java.util.ArrayList;
import java.util.List;

public class SorterByInstitutionsImpl implements SorterByInstitutions {
    @Override
    public void sortingCalls(CallsDao calls, InstitutionDao edu) {
        List<String> sortedList = new ArrayList<>();

        for(Institution institution: edu.getInstitutionsDao()) {

            for(int numberPhone: institution.getPhoneNumbers()){
                sortedList.addAll(calls.search(numberPhone));
            }
        }
    }
}
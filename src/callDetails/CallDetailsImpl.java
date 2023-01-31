package callDetails;

import dao.callDao.CallsDao;
import dao.institutionsDAO.Institution;
import dao.institutionsDAO.InstitutionDao;
import fileException.FileException;
import printer.Printer;
import printer.PrinterImpl;

import java.util.ArrayList;
import java.util.List;

public class CallDetailsImpl implements CallDetails {
    @Override
    public void callDetails(CallsDao calls, InstitutionDao edu) throws FileException {
        List<String> sortedList = new ArrayList<>();

        for(Institution institution: edu.getInstitutionsDao()) {
            sortedList.add(institution.getName() + ". Детализация звонков.");

            for(int numberPhone: institution.getPhoneNumbers()){
                sortedList.addAll(calls.search(numberPhone));
            }

            Printer printer = new PrinterImpl();
            printer.printToFile(sortedList, institution.getName());
            sortedList.clear();
        }
    }
}
package sorter;

import dao.callDao.CallsDao;
import dao.institutionsDAO.InstitutionDao;

public interface SorterByInstitutions {
    void sortingCalls (CallsDao calls, InstitutionDao edu);
}

package callDetails;

import dao.callDao.CallsDao;
import dao.institutionsDAO.InstitutionDao;
import fileException.FileException;

public interface CallDetails {
    void callDetails(CallsDao calls, InstitutionDao edu) throws FileException;
}

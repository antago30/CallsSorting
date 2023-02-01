package callDetails;

import dao.callDao.CallsDao;
import dao.institutionsDAO.InstitutionDao;
import fileException.FileException;

public interface CallDetails {
    void callDetailsGeneration(CallsDao calls, InstitutionDao edu) throws FileException;
}

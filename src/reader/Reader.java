package reader;

import dao.callDao.CallsDao;
import dao.institutionsDAO.InstitutionDao;
import fileException.FileException;

public interface Reader {
    void fileToDAO (String files, CallsDao dao) throws FileException;
    void fileToDAO (String files, InstitutionDao dao) throws FileException;
}

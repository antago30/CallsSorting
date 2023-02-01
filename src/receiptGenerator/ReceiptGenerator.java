package receiptGenerator;

import dao.callDao.CallsDao;
import dao.institutionsDAO.InstitutionDao;
import fileException.FileException;

public interface ReceiptGenerator {
    void generation (CallsDao calls, InstitutionDao edu) throws FileException;
}

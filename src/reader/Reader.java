package reader;

import dao.DAO;
import fileException.FileException;

public interface Reader {
    void fileToDAO (String files, DAO dao) throws FileException;
}

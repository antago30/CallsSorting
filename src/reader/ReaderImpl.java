package reader;

import dao.DAO;
import fileException.FileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderImpl implements Reader{
    @Override
    public void fileToDAO (String files, DAO dao) throws FileException {

        try (Scanner scanner = new Scanner(new File(files))){

            while (scanner.hasNextLine()) {

            }

        } catch (FileNotFoundException c) {
            throw new FileException("Error. File '" + files + "' not found.");
        }
    }
}

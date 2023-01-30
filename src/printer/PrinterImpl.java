package printer;

import fileException.FileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class PrinterImpl implements Printer {
    public void printToFile(List<String> array) throws FileException {

        File file = new File("TestFiles.csv");

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println(array.toString());
        } catch (FileNotFoundException e) {
            throw new FileException("Error. File '" + file + "' is in use by another application.");
        }
    }
}

package printer;

import fileException.FileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class PrinterImpl implements Printer {
    public void printToFile(List<String> array, String fileName) throws FileException {

        File file = new File("Detailing" + "\\" +fileName + ".csv");

        try (PrintWriter printWriter = new PrintWriter(file)) {

            for (String str: array) {
                printWriter.println(str);
            }

        } catch (FileNotFoundException e) {
            throw new FileException("Error. File '" + file + "' is in use by another application.");
        }
    }
}

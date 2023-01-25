package printer;

import fileException.FileException;

import java.util.List;

public interface Printer {
    void printToFile(List<String> array) throws FileException;
}

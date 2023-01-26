package sorter;

import fileException.FileException;

import java.util.List;

public interface Sorter {
    List<String> parsingCalls (List <String> calls, List<String> edu) throws FileException;
}

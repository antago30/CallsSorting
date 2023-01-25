package callsSort;

import fileException.FileException;

import java.util.List;

public interface CallsSort {
    List<String> parsingCalls (List <String> calls, List<String> edu) throws FileException;
}

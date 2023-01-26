package sorter;

import java.util.ArrayList;
import java.util.List;

public class SorterImpl implements Sorter {
    @Override
    public List<String> parsingCalls(List<String> calls, List<String> edu) {
        List <String> sortedCalls = new ArrayList<>();
        String[] eduName = edu.get(0).split(";");
        sortedCalls.add(eduName[1] + ": детализация звонков.\n");

        for (String call: calls) {
            String[] callArray = call.split(";");
            if (eduName[0].equals(callArray[0])) {
                sortedCalls.add(call + "\n");
            }
        }

        return sortedCalls;
    }
}
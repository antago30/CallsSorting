package reader;

import dao.DAO;
import dao.callDao.Call;
import fileException.FileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderImpl implements Reader{
    @Override
    public void fileToDAO (String files, DAO dao) throws FileException {
        String[] parseStr;
        String[] dataAndTime;

        try (Scanner scanner = new Scanner(new File(files))){

            while (scanner.hasNextLine()) {
                parseStr = scanner.nextLine().split(";");
                dataAndTime = parseStr[4].split(" ");

                if (parseStr.length == 2) {

                } else if (parseStr.length == 7 && !parseStr[0].equals("�������") && !parseStr[5].equals("")) {
                    dao.add(new Call(Integer.parseInt(parseStr[0]), parseStr[1], parseStr[2], parseStr[3].substring(2),
                                     dataAndTime[0], dataAndTime[1], Integer.parseInt(parseStr[5]),
                                     Integer.parseInt(parseStr[6].replaceAll("[^0-9]", ""))));
                }
            }

        } catch (FileNotFoundException c) {
            throw new FileException("Error. File '" + files + "' not found.");
        }
    }
}

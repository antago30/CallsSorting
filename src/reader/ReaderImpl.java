package reader;

import dao.callDao.Call;
import dao.callDao.CallsDao;
import dao.institutionsDAO.Institution;
import dao.institutionsDAO.InstitutionDao;
import fileException.FileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderImpl implements Reader{

    @Override
    public void fileToDAO (String files, InstitutionDao dao) throws FileException {
        String nameInstitution = "";
        StringBuilder phoneNumber = new StringBuilder();

        try (Scanner scanner = new Scanner(new File("Resources" + "\\" + files))){

            while (scanner.hasNextLine()) {
                String[] parseStr = scanner.nextLine().split(";");

                if (parseStr.length == 2) {

                    if (parseStr[1].equals(nameInstitution)) {
                        phoneNumber.append(";").append(parseStr[0]);
                    } else if (nameInstitution.equals("")){
                        nameInstitution = parseStr[1];
                        phoneNumber.append(parseStr[0]);
                    } else {
                        String[] phonesStr = phoneNumber.toString().split(";");
                        int[] phonesInt = new int[phonesStr.length];

                        for (int i = 0; i < phonesStr.length; i++) {
                            phonesInt[i] = Integer.parseInt(phonesStr[i]);
                        }

                        dao.add(new Institution(nameInstitution, phonesInt));

                        phoneNumber.setLength(0);
                        phoneNumber.append(parseStr[0]);
                        nameInstitution = parseStr[1];
                    }
                }
            }

        } catch (FileNotFoundException c) {
            throw new FileException("Error. File '" + files + "' not found.");
        }
    }

    @Override
    public void fileToDAO (String files, CallsDao dao) throws FileException {

        try (Scanner scanner = new Scanner(new File("Resources" + "\\" + files))){

            while (scanner.hasNextLine()) {
                String[] parseStr = scanner.nextLine().split(";");

                if (parseStr.length == 7 && !parseStr[0].equals("Телефон") && !parseStr[5].equals("")) {

                    String[] dataAndTime = parseStr[4].split(" ");

                    dao.add(new Call(Integer.parseInt(parseStr[0]), parseStr[1], parseStr[2],
                            parseStr[3].substring(2), dataAndTime[0], dataAndTime[1], Integer.parseInt(parseStr[5]),
                            Integer.parseInt(parseStr[6].replaceAll("[^0-9]", ""))));
                }
            }
        } catch (FileNotFoundException c) {
            throw new FileException("Error. File '" + files + "' not found.");
        }
    }
}

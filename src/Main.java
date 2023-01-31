/*
    1. Создать отдельный файл, где необходимо распарсить файл со звонками по учрежденям, из которых совершались звонки.
    2. Создать квитанцию, где надо выставить счёт за звонки совершённые во временном промежутке с 20.00 до 7.00.
*/

import dao.callDao.CallsDao;
import dao.callDao.CallsDaoImpl;
import dao.institutionsDAO.InstitutionDao;
import dao.institutionsDAO.InstitutionsDaoImpl;
import fileException.FileException;
import printer.Printer;
import printer.PrinterImpl;
import reader.Reader;
import reader.ReaderImpl;
import callDetails.CallDetails;
import callDetails.CallDetailsImpl;


public class Main {
    public static void main(String[] args) {

        try {
            InstitutionDao institutionsDao = new InstitutionsDaoImpl();
            CallsDao callsDao = new CallsDaoImpl();

            Reader reader = new ReaderImpl();
            reader.fileToDAO("edu.csv", institutionsDao);
            reader.fileToDAO("2300003713323.csv", callsDao);

            CallDetails sorter = new CallDetailsImpl();
            sorter.callDetails(callsDao, institutionsDao);

            Printer printer = new PrinterImpl();

        } catch (FileException e) {
            System.err.println(e.getStr());
        }

    }
}
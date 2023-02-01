/*
    1. Создать отдельный файл, где необходимо распарсить файл со звонками по учрежденям, из которых совершались звонки.
    2. Создать квитанцию, где надо выставить счёт за звонки совершённые во временном промежутке с 20.00 до 7.00.
*/

import dao.callDao.CallsDao;
import dao.callDao.CallsDaoImpl;
import dao.institutionsDAO.InstitutionDao;
import dao.institutionsDAO.InstitutionsDaoImpl;
import fileException.FileException;
import reader.Reader;
import reader.ReaderImpl;
import callDetails.CallDetails;
import callDetails.CallDetailsImpl;
import receiptGenerator.ReceiptGenerator;
import receiptGenerator.ReceiptGeneratorImpl;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        try {
            InstitutionDao institutionsDao = new InstitutionsDaoImpl();
            CallsDao callsDao = new CallsDaoImpl();

            Scanner scanner = new Scanner(System.in);
            Reader reader = new ReaderImpl();

            System.out.println("Поместите файлы корень проекта.");

            System.out.println("Введите название файла с перечнем учреждений в формате edu.csv:");
            reader.fileToDAO(scanner.nextLine(), institutionsDao);

            System.out.println("Введите название файла с перечнем совершённых звонков в формате 230000ххххххх.csv");
            reader.fileToDAO(scanner.nextLine(), callsDao);

            CallDetails sorter = new CallDetailsImpl();
            sorter.callDetailsGeneration(callsDao, institutionsDao);

            ReceiptGenerator receipt = new ReceiptGeneratorImpl();
            receipt.generation(callsDao, institutionsDao);

            System.out.println("Файлы детализации и квитанция к оплате находятся в папке Detailing");

        } catch (FileException e) {
            System.err.println(e.getStr());
        }

    }
}
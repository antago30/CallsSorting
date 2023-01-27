/*
    1. ������� ��������� ����, ��� ���������� ���������� ���� �� �������� �� ����������, �� ������� ����������� ������.
    2. ������� ���������, ��� ���� ��������� ���� �� ������ ����������� �� ��������� ���������� � 20.00 �� 7.00.
*/

import dao.DAO;
import dao.callDao.CallsDao;
import dao.institutionsDAO.InstitutionsDao;
import fileException.FileException;
import printer.Printer;
import printer.PrinterImpl;
import reader.Reader;
import reader.ReaderImpl;


public class Main {
    public static void main(String[] args) {

        try {
            DAO institutionsDao = new InstitutionsDao();
            DAO callsDao = new CallsDao();

            Reader reader = new ReaderImpl();
            reader.fileToDAO("edu.csv", institutionsDao);
            reader.fileToDAO("2300003713323.csv", callsDao);

            Printer printer = new PrinterImpl();
            //printer.printToFile(callsDao.getDao());
            printer.printToFile(institutionsDao.getDao());
        } catch (FileException e) {
            System.err.println(e.getStr());
        }

    }
}
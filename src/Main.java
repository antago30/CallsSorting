/*
    1. ������� ��������� ����, ��� ���������� ���������� ���� �� �������� �� ����������, �� ������� ����������� ������.
    2. ������� ���������, ��� ���� ��������� ���� �� ������ ����������� �� ��������� ���������� � 20.00 �� 7.00.
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

            System.out.println("��������� ����� ������ �������.");

            System.out.println("������� �������� ����� � �������� ���������� � ������� edu.csv:");
            reader.fileToDAO(scanner.nextLine(), institutionsDao);

            System.out.println("������� �������� ����� � �������� ����������� ������� � ������� 230000�������.csv");
            reader.fileToDAO(scanner.nextLine(), callsDao);

            CallDetails sorter = new CallDetailsImpl();
            sorter.callDetailsGeneration(callsDao, institutionsDao);

            ReceiptGenerator receipt = new ReceiptGeneratorImpl();
            receipt.generation(callsDao, institutionsDao);

            System.out.println("����� ����������� � ��������� � ������ ��������� � ����� Detailing");

        } catch (FileException e) {
            System.err.println(e.getStr());
        }

    }
}
package receiptGenerator;

import dao.callDao.Call;
import dao.callDao.CallsDao;
import dao.institutionsDAO.Institution;
import dao.institutionsDAO.InstitutionDao;
import fileException.FileException;
import printer.Printer;
import printer.PrinterImpl;

import java.util.ArrayList;
import java.util.List;

public class ReceiptGeneratorImpl implements ReceiptGenerator{

    public void generation (CallsDao calls, InstitutionDao edu) throws FileException {
        List<String> receipt = new ArrayList<>();
        int totalCost = 0;
        String nameInstitution = "";

        receipt.add ("; витанци€ на оплату звонков, совершЄнных с 20.00 до 7.00");

        for (Call call: calls.getCallDao()) {
            String[] callParse = call.getTime().split(":");

            if (Integer.parseInt(callParse[0]) >= 20 || Integer.parseInt(callParse[0]) < 7) {

                for(Institution institution: edu.getInstitutionsDao()) {
                    for(int number: institution.getPhoneNumbers()) {
                        if (number == call.getPhoneNumber()) {
                            if (!nameInstitution.equals(institution.getName())) {
                                nameInstitution = institution.getName();
                                receipt.add(";" + institution.getName());
                            }
                            receipt.add(call.toString());
                            totalCost += call.getPrice();
                        }
                    }
                }
            }
        }

        receipt.add(";»того к оплате: " + ";;;;;;"  + totalCost / 10000 + "," + totalCost % 10000);

        Printer printer = new PrinterImpl();
        printer.printToFile(receipt, " витанци€.csv");
    }
}

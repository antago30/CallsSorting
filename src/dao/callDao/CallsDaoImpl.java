package dao.callDao;

import java.util.ArrayList;
import java.util.List;

public class CallsDaoImpl implements CallsDao {
    List<Call> callDao = new ArrayList<>();

    public void add (Call data) {
        callDao.add(data);
    }

    public List<Call> getCallDao() {
        return callDao;
    }

    public List<String> search (int phoneNumber) {
        List <String> arrayResult = new ArrayList<>();
        int totalCost = 0;

        for (Call call: callDao) {
            if (phoneNumber == call.getPhoneNumber()){
                arrayResult.add(call.toString());
                totalCost += call.getPrice();
            }
        }

        if (arrayResult.size() != 0)
            arrayResult.add(";Итоговая стоимость по номеру: " + ";;;;;;" + totalCost / 10000 + "," + totalCost % 10000);

        return arrayResult;
    }
}

package dao.callDao;

import java.util.ArrayList;
import java.util.List;

public class CallsDaoImpl implements CallsDao {
    List<Call> callDao = new ArrayList<>();

    public void add (Call data) {
        callDao.add(data);
    }

    public List<String> search (int phoneNumber) {
        List <String> arrayResult = new ArrayList<>();

        for (Call call: callDao) {
            if (phoneNumber == call.getPhoneNumber())
                arrayResult.add(call.toString());
        }

        return arrayResult;
    }
}

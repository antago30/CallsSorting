package dao.callDao;

import dao.DAO;

import java.util.ArrayList;
import java.util.List;

public class CallsDao extends DAO {
    List<Call> callDao = new ArrayList<>();

    public void add (Call call) {
        callDao.add(call);
    }
}

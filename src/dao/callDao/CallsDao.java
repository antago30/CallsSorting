package dao.callDao;

import dao.DAO;

import java.util.ArrayList;
import java.util.List;

public class CallsDao implements DAO {
    List<Call> callDao = new ArrayList<>();

    public void add (Object data) {
        callDao.add((Call) data);
    }

    public void printDao() {
        for(Call str: callDao) {
            System.out.println(str);
        }
    }

    public List<String> getDao() {
        List <String> array = new ArrayList<>();

        for (Call str: callDao) {
            array.add(str.toString());
        }

        return array;
    }
}

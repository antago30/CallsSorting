package dao.callDao;

import java.util.List;

public interface CallsDao {
    void add (Call data);
    List<Call> getCallDao();
    List<String> search (int phoneNumber);
}


package dao.callDao;

import java.util.List;

public interface CallsDao {
    void add (Call data);
    List<String> search (int phoneNumber);
}


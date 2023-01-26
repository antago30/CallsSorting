package dao.institutionsDAO;

import dao.DAO;

import java.util.ArrayList;
import java.util.List;

public class InstitutionsDao  implements DAO {
    List<Institution> institutionsDao = new ArrayList<>();

    public void add (Object institution) {
        institutionsDao.add((Institution) institution);
    }

    @Override
    public void printDao() {

    }
}

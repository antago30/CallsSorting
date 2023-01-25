package dao.institutionsDAO;

import dao.DAO;

import java.util.ArrayList;
import java.util.List;

public class InstitutionsDao extends DAO {
    List<Institution> institutionsDao = new ArrayList<>();

    public void add (Institution institution) {
        institutionsDao.add(institution);
    }
}

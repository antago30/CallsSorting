package dao.institutionsDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstitutionsDaoImpl implements InstitutionDao {
    List<Institution> institutionsDao = new ArrayList<>();

    public void add (Institution institution) {
        institutionsDao.add(institution);
    }

    public List <Institution> getInstitutionsDao() {
        return institutionsDao;
    }
}

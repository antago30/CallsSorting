package dao.institutionsDAO;

import java.util.ArrayList;
import java.util.List;

public class InstitutionsDaoImpl implements InstitutionDao {
    List<Institution> institutionsDao = new ArrayList<>();

    public void add (Institution institution) {
        institutionsDao.add(institution);
    }

    public List <Institution> getInstitutionsDao() {
        return institutionsDao;
    }
}

package dao.institutionsDAO;

import dao.DAO;
import dao.callDao.Call;

import java.util.ArrayList;
import java.util.List;

public class InstitutionsDao  implements DAO {
    List<Institution> institutionsDao = new ArrayList<>();

    public void add (Object institution) {
        institutionsDao.add((Institution) institution);
    }

    @Override
    public void printDao() {
        for(Institution str: institutionsDao) {
            System.out.println(str);
        }
    }

    @Override
    public List<String> getDao() {
        List <String> array = new ArrayList<>();

        for (Institution str: institutionsDao) {
            array.add(str.toString() + "\n");
        }

        return array;
    }
}

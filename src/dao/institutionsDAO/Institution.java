package dao.institutionsDAO;

public class Institution {
    private String name;
    private int[] phoneNumbers;

    public Institution(String name, int[] phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }
}

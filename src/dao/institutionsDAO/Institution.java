package dao.institutionsDAO;

public class Institution {
    private final String name;
    private final int[] phoneNumbers;

    public Institution(String name, int[] phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public int[] getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return name;
    }
}

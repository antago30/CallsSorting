package dao.institutionsDAO;

import java.util.Arrays;

public class Institution {
    private final String name;
    private final int[] phoneNumbers;

    public Institution(String name, int[] phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return name + ", " + Arrays.toString(phoneNumbers);
    }
}

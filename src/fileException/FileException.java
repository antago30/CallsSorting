package fileException;

public class FileException extends Exception{
    private final String myException;
    public FileException(String message) {
        myException = message;
    }

    public String getStr() {
        return myException;
    }
}

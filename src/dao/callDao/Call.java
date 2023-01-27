package dao.callDao;

public class Call {
    private final int phoneNumber;
    private final String typeOfConnection;
    private final String direction;
    private final String calledSubscriber;
    private final String date;
    private final String time;
    private final int duration;
    private final int price;

    public Call(int phoneNumber, String typeOfConnection, String direction, String calledSubscriber, String date, String time, int duration, int price) {
        this.phoneNumber = phoneNumber;
        this.typeOfConnection = typeOfConnection;
        this.direction = direction;
        this.calledSubscriber = calledSubscriber;
        this.date = date;
        this.time = time;
        this.duration = duration;
        this.price = price;
    }

    @Override
    public String toString() {
        return phoneNumber + ";" + typeOfConnection + ";" + direction + ";" + calledSubscriber + ";" + date +
                ";" + time + ";" + duration + ";" + price;
    }
}

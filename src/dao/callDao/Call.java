package dao.callDao;

public class Call {
    private int phoneNumber;
    private String typeOfConnection;
    private String direction;
    private String calledSubscriber;
    private String date;
    private String time;
    private int duration;
    private int price;

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

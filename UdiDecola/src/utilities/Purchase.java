package utilities;
import java.time.LocalDateTime;
import java.util.Arrays;
class Purchase {
    private String flight;
    private LocalDateTime dateTime;
    private String client;
    private double totalValue;
    private String paymentMethod;
    private String roomStay;
    private LocalDateTime[] checkIn;
    private LocalDateTime[] checkOut;
    private double finalValue;

    public Purchase(String flight, LocalDateTime dateTime, String client, double totalValue, String paymentMethod,
                    String roomStay, LocalDateTime[] checkIn, LocalDateTime[] checkOut, double finalValue) {
        this.flight = flight;
        this.dateTime = dateTime;
        this.client = client;
        this.totalValue = totalValue;
        this.paymentMethod = paymentMethod;
        this.roomStay = roomStay;
        this.checkIn = checkIn;
        this.checkOut=checkOut;
        this.finalValue = finalValue;
    }


	@Override
    public String toString() {
        return "Purchase{" +
                "flight='" + flight + '\'' +
                ", dateTime=" + dateTime +
                ", client='" + client + '\'' +
                ", totalValue=" + totalValue +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", roomStay='" + roomStay + '\'' +
                ", checkIn=" + Arrays.toString(checkIn) +
                ", checkOut=" + Arrays.toString(checkOut) +
                '}';
    }
}


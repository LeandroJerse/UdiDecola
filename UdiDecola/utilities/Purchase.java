package utilities;
import java.time.LocalDateTime;

class Purchase {
    private String flight;
    private LocalDateTime dateTime;
    private String client;
    private double totalValue;
    private String paymentMethod;

    public Purchase(String flight, LocalDateTime dateTime, String client, double totalValue, String paymentMethod) {
        this.flight = flight;
        this.dateTime = dateTime;
        this.client = client;
        this.totalValue = totalValue;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "flight='" + flight + '\'' +
                ", dateTime=" + dateTime +
                ", client='" + client + '\'' +
                ", totalValue=" + totalValue +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}


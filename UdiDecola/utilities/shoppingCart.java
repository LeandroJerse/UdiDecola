package utilities;
import java.util.ArrayList;
import java.util.List;
import utilities.Purchase;

public class ShoppingCart {
    private List<Purchase> purchases;
    private int points;

    public ShoppingCart() {
        this.purchases = new ArrayList<>();
        this.points = 0;
    }

    public void addAirlineTicket(String ticket, int quantity, String client, double totalValue, String paymentMethod) {
        purchases.add(new Purchase(ticket, quantity, client, totalValue, paymentMethod));
        points += quantity;
    }

    public void addHotelRoomStay(String roomStay, int quantity, String client, double totalValue, String paymentMethod) {
        purchases.add(new Purchase(roomStay, quantity, client, totalValue, paymentMethod));
        points += quantity;
    }

    public int getPoints() {
        return points;
    }

}

package utilities;
import java.util.ArrayList;
import utilities.Purchase;
import java.util.List;

public class ShoppingCart {
    private List<Purchase> purchases;
    private int points;

    public ShoppingCart() {
        this.purchases = new ArrayList<>();
        this.points = 0;
    }

    public void addAirlineTicket(String ticket, int quantity, String client, double totalValue, String paymentMethod, double commission) {
        double finalValue = totalValue - (totalValue * commission);
        purchases.add(new Purchase(ticket, quantity, client, finalValue, paymentMethod));
        points += quantity;
    }

    public void addHotelRoomStay(String roomStay, int quantity, String client, double totalValue, String paymentMethod, double commission) {
        double finalValue = totalValue - (totalValue * commission);
        purchases.add(new Purchase(roomStay, quantity, client, finalValue, paymentMethod));
        points += quantity;
    }
    public int getPoints() {
        return points;
    }


}

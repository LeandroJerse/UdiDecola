package utilities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Purchase> purchases;
    private int points;

    public ShoppingCart() {
        this.purchases = new ArrayList<>();
        this.points = 0;
    }

    public void addAirlineTicket(String ticket, String client, double totalValue, String paymentMethod, double commission) {
        double finalValue = totalValue - (totalValue * commission);
        purchases.add(new Purchase("ticket", ticket, client, null, finalValue, paymentMethod, null, null, null));
        points++;
    }

    public void addHotelRoomStay(String roomStay, String client, double totalValue, String paymentMethod, double commission, LocalDate checkInDate, LocalDate checkOutDate) {
        double finalValue = totalValue - (totalValue * commission);
        purchases.add(new Purchase("roomstay", roomStay, client, null, finalValue, paymentMethod, checkInDate, checkOutDate, null));
        points++;
    }

    public int getPoints() {
        return points;
    }
}

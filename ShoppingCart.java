import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<ItemOrder> orders;
    private boolean hasDiscount;

    public ShoppingCart() {
        orders = new ArrayList<>();
        hasDiscount = false;
    }
//adds an item order to the list, replacing any previous order for this item with the new order.  The parameter will be of type ItemOrder.
    public void add(ItemOrder order) {
        // Check if an order for the same item already exists, replace it if found
        for (int i = 0; i < orders.size(); i++) {
            ItemOrder existingOrder = orders.get(i);
            if (existingOrder.getItem().equals(order.getItem())) {
                orders.set(i, order);
                return;
            }
        }
        orders.add(order);
    }
//Sets whether or not this order gets a discount (true means there is a discount, false means no discount).
    public void setDiscount(boolean value) {
        hasDiscount = value;
    }
//Returns the total cost of the shopping cart.
    public double getTotal() {
        double total = 0;
        for (ItemOrder order : orders) {
            total += order.getPrice();
        }
        if (hasDiscount) {
            total *= 0.90; // Apply a 10% discount
        }
        return total;
    }
}

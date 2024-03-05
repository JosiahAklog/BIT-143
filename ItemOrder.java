// ItemOrder.java
public class ItemOrder {
    private Item item;
    private int quantity;

//Constructor that creates an item order for the given item and given quantity.  The quantity will be an integer.
    public ItemOrder(Item item, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.item = item;
        this.quantity = quantity;
    }

    
//Returns the cost for this item order.

    public double getPrice() {
        return item.priceFor(quantity);
    }
//Returns a reference to the item in this order.
    public Item getItem() {
        return item;
    }
}


// Item.java
public class Item {
    private String name;
    private double price;
    private int bulkQuantity;
    private double bulkPrice;

//Constructor that takes a name and a price as arguments.  The name will be a String and the price will be a double. Should throw an IllegalArgumentException if price is negative.

    public Item(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.name = name;
        this.price = price;
    }

//Constructor that takes a name and a single-item price and a bulk quantity and a bulk price as arguments.  The name will be a String and the quantity will be an integer and the prices will be doubles.  Should throw an IllegalArgumentException if any number is negative.

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        if (price < 0 || bulkPrice < 0 || bulkQuantity <= 0) {
            throw new IllegalArgumentException("Price, bulkPrice, and bulkQuantity must be positive.");
        }
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

//Returns the price for a given quantity of the item (taking into account bulk price, if applicable).  Quantity will be an integer.  Should throw an IllegalArgumentException if quantity is negative.

    public double priceFor(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        if (bulkQuantity > 0 && quantity >= bulkQuantity) {
            int bulkItems = quantity / bulkQuantity;
            int remainingItems = quantity % bulkQuantity;
            return (bulkItems * bulkPrice) + (remainingItems * price);
        }
        return quantity * price;
    }

//Returns a String representation of this item: name followed by a comma and space followed by price.  If this has a bulk price, then you should append an extra space and a parenthesized description of the bulk pricing that has the bulk quantity, the word “for” and the bulk price.

    public String toString() {
        if (bulkQuantity > 0) {
            return name + ", " + price + " (" + bulkQuantity + " for " + bulkPrice + ")";
        }
        return name + ", " + price;
    }

    //You should make sure that you can compare items based on the contents of the item (rather than by asking if two variables refer to the same Item object).  You can do this by overriding the .equals() method.

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item other = (Item) obj;
        return this.name.equals(other.name) && this.price == other.price;
    }
}

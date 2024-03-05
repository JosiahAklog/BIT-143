// Catalog.java
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Item> items;


//Constructor that takes the name of this catalog as a parameter.  The name will be a String.

    public Catalog(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    
//Adds an Item at the end of this list.
    public void add(Item item) {
        items.add(item);
    }
//Returns the number of items in this list.
    public int size() {
        return items.size();
    }
//Returns the Item with the given index
    public Item get(int index) {
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        return items.get(index);
    }
//	Returns the name of this catalog.
    public String getName() {
        return name;
    }
}

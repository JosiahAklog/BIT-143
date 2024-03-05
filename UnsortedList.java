import java.util.Arrays;

public class UnsortedList<Type> {

    private Type[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public UnsortedList() {
        array = (Type[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void insert(Type value) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
        array[size++] = value;
    }

    public boolean contains(Type value) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    // Other methods like remove, get, set, etc. can be implemented similarly

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    // Method to run tests
    public static void main(String[] args) {
        UnsortedList<String> unsortedList = new UnsortedList<>();

        unsortedList.insert("varik0");
        unsortedList.insert("varik1");
        unsortedList.insert("varik2");
        unsortedList.insert("varik3");

        System.out.println("UnsortedList after insertions: " + unsortedList);
        System.out.println("Contains 'varik0': " + unsortedList.contains("varik0"));
        System.out.println("Contains 'Varik0': " + unsortedList.contains("Varik0"));
    }
}

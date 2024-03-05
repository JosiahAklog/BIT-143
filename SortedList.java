import java.util.Arrays;

public class SortedList<Type extends Comparable<Type>> {

    private Type[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public SortedList() {
        array = (Type[]) new Comparable[DEFAULT_CAPACITY];
        size = 0;
    }

    public void insert(Type value) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }

        int index = size;
        while (index > 0 && array[index - 1] != null && value.compareTo(array[index - 1]) < 0) {
            array[index] = array[index - 1];
            index--;
        }
        array[index] = value;
        size++;
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
        SortedList<String> sortedList = new SortedList<>();

        sortedList.insert("varik0");
        sortedList.insert("varik1");
        sortedList.insert("varik2");
        sortedList.insert("varik3");

        System.out.println("SortedList after insertions: " + sortedList);
        System.out.println("Contains 'varik0': " + sortedList.contains("varik0"));
        System.out.println("Contains 'Varik0': " + sortedList.contains("Varik0"));
    }
}

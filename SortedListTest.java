public class SortedListTest {
    public static void main(String[] args) {
        testSortedList();
    }

    private static void testSortedList() {
        System.out.println("\nTesting SortedList:");

        // Create a new SortedList
        SortedList<String> sortedList = new SortedList<>();

        // Insert elements
        sortedList.insert("varik2");
        sortedList.insert("varik0");
        sortedList.insert("varik1");

        // Test contains method
        System.out.println("Contains varik0: " + sortedList.contains("varik0")); // true
        System.out.println("Contains Varik0: " + sortedList.contains("Varik0")); // false

        // Remove an element
        System.out.println("Removing varik1: " + sortedList.remove("varik1")); // varik1
        System.out.println("After removing varik1: " + sortedList);

        // Test removeAtIndex method
        System.out.println("Removing element at index 0: " + sortedList.removeAtIndex(0)); // varik0
        System.out.println("After removing element at index 0: " + sortedList);

        // Clear the list
        sortedList.clear();
        System.out.println("After clearing the list: " + sortedList);
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

class Lecture04 {

    public static void main(String[] args) {
        System.out.println("Hello from lecture 04");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 1. When should you use a LinkedList instead of an ArrayList?
        // If you keep enter and delating elements

        // 2. Would a LinkedList or an ArrayList perform better when run on the
        // following code? Why?
        //This is because ArrayList is backed by an array, and retrieving an element by index is very fast.
        // public static int min(List<Integer> list) {
        // int min = list.get(0);
        // for (int i = 1; i < list.size(); i++) {
        // if (list.get(i) < min) {
        // min = list.get(i);
        // }
        // }
        // return min;
        // }

        // 3. What is an iterator? Why are iterators often used with linked lists?
        //An iterator is a programming concept that provides a way to access elements in a collection or container (such as lists, arrays, or data structures).
        //iterators are used with linked lists to provide an efficient and flexible way to traverse, manipulate, and work with the elements of a linked list.

        // 4. Write a piece of code that counts the number of duplicate elements in a
        // linked list.
        // That is, the number of elements whose values are repeated at an earlier index
        // in the list. Assume that all duplicates in the list occur consecutively. For
        // example, the list [1, 1, 3, 5, 5, 5, 5, 7, 7, 11] contains five duplicates:
        // one duplicate of element value 1, three duplicates of element value 5, and
        // one duplicate of element value 7.
public static int countDuplicates(LinkedList<Integer> list) {
        int duplicateCount = 0;
        
        // Create a ListIterator to traverse the list
        ListIterator<Integer> iterator = list.listIterator();
        
        // Initialize variables to keep track of the current element and its count
        int currentElement = iterator.next();
        int currentCount = 1;

        while (iterator.hasNext()) {
            int nextElement = iterator.next();

            if (nextElement == currentElement) {
                // If the current element is the same as the next one, increment the count
                currentCount++;
            } else {
                // If the next element is different, check if there were duplicates
                if (currentCount > 1) {
                    duplicateCount += 1;  // Increment the duplicate count
                }

                // Update the current element and reset the count
                currentElement = nextElement;
                currentCount = 1;
            }
        }

        // Check if there were duplicates at the end of the list
        if (currentCount > 1) {
            duplicateCount += 1;  // Increment the duplicate count for the last element
        }

        return duplicateCount;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(11);

        int duplicates = countDuplicates(list);
        System.out.println("Number of duplicates: " + duplicates); // Output should be 5
    }
}
        // 5. Write a piece of code that inserts a String into an ordered linked list of
        // Strings, maintaining sorted order.
        // For example, for the list ["Alpha", "Baker", "Foxtrot", "Tango", "Whiskey"],
        // inserting "Charlie" in order would produce the list ["Alpha", "Baker",
        // "Charlie", "Foxtrot", "Tango", "Whiskey"].
 while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.compareTo(newValue) > 0) {
                // The current element is greater than the new value, so insert before it
                iterator.previous();  // Move the iterator back one step
                iterator.add(newValue); // Insert the new value
                return;
            }
        }

        // If we reached the end of the list, add the new value at the end
        list.addLast(newValue);
    }

    public static void main(String[] args) {
        LinkedList<String> orderedList = new LinkedList<>();
        orderedList.add("Alpha");
        orderedList.add("Baker");
        orderedList.add("Foxtrot");
        orderedList.add("Tango");
        orderedList.add("Whiskey");

        String newValue = "Charlie";
        insertSorted(orderedList, newValue);

        // Print the updated list
        for (String value : orderedList) {
            System.out.println(value);
        }
    }
}
        // From Section 11.2: Sets
        // 10. A List has every method that a Set has, and more. So why would you use a
        // Set rather than a List?
        
//While it's true that a List in Java has every method that a Set has, and more, the choice between using a List or a Set should be based on the specific requirements and characteristics of your data. Both data structures have distinct use cases and advantages.

        // 11. When should you use a TreeSet, and when should you use a HashSet?
// Treeset is used for Ordered Elements,Sorted Set:Custom Sorting
//Hashset is used Uniqueness: Faster Membership Checks: General-Purpose Set: 

        // 12. A Set doesn’t have the get and set methods that an ArrayList has. How do
        // you examine every element of a Set?
        //you can examine every element in a Set using various methods:

        // 13. What elements are contained in the following set after this code
        // executes?

        // Set<Integer> set = new HashSet<>();
        // set.add(74);
        // set.add(12);
        // set.add(74);
        // set.add(74);
        // set.add(43);
        // set.remove(74);
        // set.remove(999);
        // set.remove(43);
        // set.add(32);
        // set.add(12);
        // set.add(9);
        // set.add(999);
//Answer: 12, 32, and 9.

        // 14. How do you perform a union operation on two sets? An intersection? Try to
        // give an answer that doesn’t require any loops.
        Set<T> intersection = new HashSet<>(set1); // Create a copy of set1
intersection.retainAll(set2); // Retain only the elements that are in set2


        // 15. Write the output produced when the following method is passed each of the
        // following lists:

        // public static void mystery(List<String> list) {
        // Set<String> result = new TreeSet<>();
        // for (String element : list) {
        // if (element.compareTo(list.get(0)) < 0) {
        // result.add(element);
        // } else {
        // result.clear();
        // }
        // }
        // System.out.println(result);
        // }
        // [marty, stuart, helene, jessica, amanda]
        // [sara, caitlin, janette, zack, riley]
        // [zorah, alex, tyler, roy, roy, charlie, phil, charlie, tyler]
// ["zorah", "alex", "tyler", "roy", "roy", "charlie", "phil", "charlie", "tyler"]

        // Exercises:
        // 2. Write a method called alternate that accepts two Lists as its parameters
        // and returns a new List containing alternating elements from the two lists, in
        // the following order:

         List<Integer> result = new ArrayList<>();

        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                result.add(list1.get(i));
            }
            if (i < size2) {
                result.add(list2.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(6, 7, 8, 9, 10, 11, 12);

        List<Integer> result = alternate(list1, list2);
        System.out.println(result);
    }
}

        // First element from first list
        // First element from second list
        // Second element from first list
        // Second element from second list
        // Third element from first list
        // Third element from second list
        // . . .
        // If the lists do not contain the same number of elements, the remaining
        // elements from the longer list should be placed consecutively at the end. For
        // example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8,
        // 9, 10, 11, 12], a call of alternate(list1, list2) should return a list
        // containing [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].

        // 9. Write a method hasOdd that accepts a set of integers as a parameter and
        // returns true if the set contains at least one odd integer and false
        // otherwise.
        // If passed the empty set, your method should return false.
    
 for (int number : integerSet) {
            if (number % 2 != 0) {
                return true; // Found an odd number, return true
            }
        }
        return false; // No odd numbers found in the set, return false
    }

    public static void main(String[] args) {
        // Example usage:
        // Create a set with some integers
        // You can use a HashSet, TreeSet, or any other Set implementation
        Set<Integer> integerSet = Set.of(2, 4, 6, 8, 10);

        // Check if the set has at least one odd number
        boolean hasOddNumber = hasOdd(integerSet);

        if (hasOddNumber) {
            System.out.println("The set contains at least one odd number.");
        } else {
            System.out.println("The set does not contain any odd numbers.");
        }
    }
}
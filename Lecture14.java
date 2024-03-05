import java.util.ArrayList;
import java.util.List;

class Lecture14 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 14");

        // Self-Check Problems:
        // Section 15.3: Advanced Features
        // 14. When this new version of the class fills to its capacity, it resizes.
        // How much does it grow? Why choose this growth rate, rather than increasing
        // the capacity by a single element or other constant amount?

// the growth rate is chosen to optimize the trade-off between minimizing the number of resizing operations and efficiently utilizing memory.

        // 15. What is the benefit of adding an iterator to the list class?

//  adding an iterator to a list class improves code readability, supports standard programming practices, and enhances the flexibility and compatibility of the class within a larger software ecosystem.

        // 16. What state does the array list iterator store?

// iterator typically includes information about the current position or index within the ArrayList. 

        // 17. How does the array list iterator know if there are more elements left to
        // examine?
        // What does it do if the client tries to examine a next element but there are
        // none left to examine?

//  hasNext() is called before next() to ensure that there are more elements to examine. If there are no more elements, an exception is thrown to indicate that the end of the ArrayList has been reached.

        // 18. What is a precondition of the iterator’s remove method?
        // How does the iterator enforce this precondition, and what does it do if the
        // precondition is violated?

//A common precondition for the remove method is that it should be called after at least one call to next() and before any subsequent calls to remove() or next(). In other words, you must call next() to advance to a specific element before removing it.

        // 19. Write a method called sum that returns the sum of all values in the list.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.sum() should return 63. If the list is empty, sum should return
        // 0.

public int sum() {
        int sum = 0;
        
        // Iterate through the list and add each value to the sum
        for (int value : values) {
            sum += value;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        MyList myList = new MyList();
        myList.values = new ArrayList<>(List.of(11, -7, 3, 42, 0, 14));

        // Calculate and print the sum
        int result = myList.sum();
        System.out.println("Sum: " + result);  // Output: Sum: 63
    }
}

        // 20. Write a method called average that returns the average of the values in
        // the list as a real number.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.average() should return 10.5. If the list is empty, average
        // should return 0.0.
 private List<Integer> values;

    // Constructor and other methods...

    // Method to calculate the average of all values in the list
    public double average() {
        if (values.isEmpty()) {
            return 0.0; // Return 0.0 if the list is empty
        }

        int sum = 0;

        // Iterate through the list and add each value to the sum
        for (int value : values) {
            sum += value;
        }

        // Calculate the average
        return (double) sum / values.size();
    }

    public static void main(String[] args) {
        // Example usage
        MyList myList = new MyList();
        myList.values = new ArrayList<>(List.of(11, -7, 3, 42, 0, 14));

        // Calculate and print the average
        double result = myList.average();
        System.out.println("Average: " + result);  // Output: Average: 10.5
    }
}
        // Section 15.4: ArrayList<E>
        // 21. What problem do we encounter when we try to construct an array of type E?
        // How do we resolve this problem?

        // you cannot directly create an array of a parameterized type (like E). This is because the type information for generics is erased at runtime due to type erasure. As a result, you can't instantiate an array with a generic type because the compiler needs to know the actual type of the elements at runtime.

        // 22. Since our list stores an unfilled array, the empty elements were filled
        // with the value 0 when our array was full of integers.
        // What value occupies the empty cells when our list stores values of type E?
// 
//When a list stores values of type E (objects), and the underlying array is unfilled or contains uninitialized elements, those elements are assigned the default value for objects, which is null. 

        // 23. What changes need to be made to the indexOf method to search for objects
        // of type E in the new list class, and why are these changes necessary?
// 
//you need to update the comparison logic. The indexOf method typically uses the equals method to compare objects for equality

        // 24. What is an annotation? How are annotations useful in writing our
        // ArrayList<E> class?
public class ArrayList<E> {
    // class implementation
}
        //annotation in Java is a form of metadata that provides additional information about code elements (such as classes, methods, fields, etc.) to the compiler, runtime environment, or development tools.

        // 25. Why is it important to set empty elements to null when we are clearing or
        // removing from the list of type E, when we didn’t need to clear out these
        // elements in the previous ArrayIntList?

        //setting empty elements to null in a generic list of type E promotes type safety, adheres to Java conventions, helps manage memory efficiently, and provides a clear indication of the absence of a valid value in the list.

        // 26. What is one benefit of making the list iterator into an inner class?
//making the list iterator an inner class enhances encapsulation, allows convenient access to private members, simplifies code, logically groups related functionality, improves code organization, and supports the maintenance of iterator state.

        // Exercises:
        // None

    }
}

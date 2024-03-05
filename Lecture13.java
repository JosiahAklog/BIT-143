import java.util.List;

class Lecture13 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 13");

        // Self-Check Problems:
        // Section 15.1: Simple ArrayIntList

        // 1. What is the difference between an array list’s size and its capacity?
        // What is the relationship between the two values? (Is one always larger or
        // smaller than the other, for instance?)

        // size is the actual number of elements in the ArrayList, while capacity is the total number of elements it can hold without needing to resize. The relationship is that capacity is typically greater than or equal to size, and the capacity might be adjusted dynamically as elements are added to the ArrayList.

        // 2. What fields must be included in the ArrayIntList class, and why is each
        // field important? Would the class still work correctly if we removed any of
        // these fields?

        // You need an elementData, size, default capcapsity, elementData, there would be no structure to hold the elements, rendering the class ineffective for storing a collection of items.

//Without size, you would lose the ability to accurately track the number of elements in the list, leading to incorrect behavior for operations like getting the size, adding, or removing elements.

//Removing DEFAULT_CAPACITY might make the class less flexible, requiring hardcoding initial capacities in various places, potentially leading to less maintainable code.

//Removing MAX_ARRAY_SIZE might lead to potential issues if the array is allowed to grow beyond a certain size, risking memory problems

        // 3. Why does the list class use a toString method rather than a print method?

        // By using toString, you can obtain a string representation of your list and then choose how to use or display that string in different parts of your application. This separation of concerns and flexibility make the design more versatile and adaptable to various scenarios.

        // 4. We wrote the class to have public methods called size (to read the number
        // of elements of the list) and get (to access the element value at a specific
        // index).
        // Why is this approach better than declaring the fields (such as size) public?

        //If you had exposed fields directly, any change to the internal representation would require modifying all the places where those fields are accessed, potentially leading to maintenance challenge

        // 7. An element can be inserted at the beginning, middle, or end of an array
        // list.
        // Which of the three insertion points is the most computationally expensive,
        // and why? Which is the most expensive location to remove an element from the
        // list?

        //  insertion and removal at the beginning of an ArrayList are the most computationally expensive operations due to the need to shift elements. Operations at the middle are less expensive than at the beginning but still require shifting. Insertion and removal at the end are generally the least expensive operations

        // 8. Write methods called min and max that return the smallest and largest
        // values in the list respectively.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.min() should return –7 and the call of list.max() should return
        // 42. If the list is empty, the methods should throw an IllegalStateException.


    private List<Integer> elements;

    // constructor, other methods...

    public int min() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        int min = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            int current = elements.get(i);
            if (current < min) {
                min = current;
            }
        }

        return min;
    }

    public int max() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        int max = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            int current = elements.get(i);
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    // other methods...
}


        // Section 15.2: A More Complete ArrayIntList

        // 9. Describe the overall preconditions placed on the list class in this
        // section.
        // What assumptions do we make about how clients will use the list?

        //clients are expected to initialize the list, add non-null elements, and handle exceptions for empty lists appropriately. The methods are designed with certain assumptions about the nature of the list and the types of operations clients will perform

        // 10. What is the purpose of the checkIndex method?
        // Where is it called in the list class? Describe a way that the client can
        // utilize an ArrayIntList that will be caught by checkIndex.

        // the client is attempting to access an element at index 1 in a list that only has one element. The checkIndex method would catch this attempt to access an out-of-bounds index and throw an IndexOutOfBoundsException

        // 11. What is the purpose of the checkCapacity method?
        // Where is it called in the list class? Describe a way that the client can
        // utilize an ArrayIntList that will be caught by checkCapacity.

        //, the client is adding 1000 elements to the list. The checkCapacity method would be triggered during this process, resizing the underlying array to accommodate the growing list. Without this capacity check, the list might encounter issues when attempting to add more elements than the initial capacity allows


        // 12. Once we check thoroughly for preconditions in the code, what data
        // invariants can we now assume about the list?

        //
//1.	Valid Indices:
//2.	Consistent Size:
//.	Capacity Reflects the Actual Array Size:.
//4.	Consistent Element Types:.
//5.	Non-Null Elements:.
//6.	Sequential Order of Elements:
//7.	Array References Are Not Exposed:.
//8.	No Concurrent Modifications:


        // 13. Why do we bother to add the contains, isEmpty, and remove methods to the
        // list class, when the client can already perform this same functionality with
        // the indexOf, size, and remove methods, respectively?

// While it's true that clients can achieve similar functionality using existing methods, providing dedicated methods enhances the usability, maintainability, and readability of the list class API. It also allows the list implementation to be more self-contained and adaptable to potential changes in the future.

        // Exercises:
        // None
    }
}

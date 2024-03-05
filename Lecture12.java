import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Lecture12 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 12");

        // Self-Check Problems:
        // Section 14.1: Stack/Queue Basics

        // 1. Which of the following statements about stacks and queues is true?
        // Answer: "A queue’s remove method removes and returns the element at the front of the queue."

        // A. Stacks and queues can store only integers as their data.
        // B. A stack returns elements in the same order as they were added (first-in,
        // first-out).
        // C. A queue’s remove method removes and returns the element at the front of
        // the
        // queue.
        // D. Stacks and queues are similar to lists, but less efficient.
        // E. The peek method allows access to the element at the bottom of a stack.

        // 2. What is a real-world example of data that could be modeled using a stack?
        // Using a queue?
        // A queue can represent a print queue in a networked environment. Print jobs from multiple users are added to the queue, and they are processed in a first-come, first-served (FCFS) manner. 


        // 3. When you call push on a stack, where is the new element placed relative to
        // the other elements in the stack?
        // When you call pop, which element from the stack is returned?

        //When you call pop on a stack, the element returned is the one that was most recently added to the stack. In other words, the top element of the stack is removed and returned by the pop operation

        // 4. When you call add on a queue, where is the new element placed relative to
        // the other elements in the queue?
        // When you call remove, which element from the queue is returned?
        //When you call add (or enqueue) on a queue, the new element is placed at the end (rear) of the queue. In other words, it becomes the last element in the queue.


        // 5. If you create a new empty stack and push the values 1, 2, and 3 in that
        // order, and call pop on the stack once, what value will be returned?
        //If you create a new empty stack, push the values 1, 2, and 3 in that order, and then call pop on the stack once, the value returned will be 3. 

        // 6. If you create a new empty queue and add the values 1, 2, and 3 in that
        // order, and call remove on the queue once, what value will be returned?
        //The remove operation removes and returns the element at the front of the queue, and since you added 1 first, it will be the first to be removed from the queue.

        // Section 14.2: Common Stack/Queue Operations

        // 12. Stacks and queues have less functionality than other similar collections
        // like lists and maps.
        // Why are they still useful despite lacking functionality? What possible
        // advantages are there of using a less powerful collection?
        // while stacks and queues may lack the extensive functionality of other collections, their simplicity, efficiency, and suitability for specific use cases make them valuable tools in programming and computer science. They provide focused solutions to problems where their characteristics align with the requirements of the application.

        // 13. What is the output of the following code?
        // Do this by hand to make sure that you understand stacks and queues
        // [how, are, you]


        // 14. What is the output of the following code?
        // Do this by hand to make sure that you understand stacks and queues
        // 10
        //  7
        //    5
        //    false
       //     2
       //     3
       //     8


        // 22. Write a piece of code that prints the elements of a queue of integers,
        // one per line.
        // When your code is done running, the queue should still contain the same
        // contents as it had at the start. In other words, don’t destroy the queue as
        // you print it. If you like, put your code into a method called print that
        // accepts the queue as a parameter.
import java.util.LinkedList;
import java.util.Queue;

public class QueuePrinter {

    public static void main(String[] args) {
        // Example usage
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.offer(1);
        integerQueue.offer(2);
        integerQueue.offer(3);

        // Call the print method
        print(integerQueue);

        // Original queue still contains the same contents
        System.out.println("Original queue contents after printing:");
        System.out.println(integerQueue);
    }

    public static void print(Queue<Integer> queue) {
        // Create a copy of the original queue to avoid modifying it
        Queue<Integer> copyQueue = new LinkedList<>(queue);

        // Print each element of the queue one per line
        System.out.println("Printing the elements of the queue:");
        while (!copyQueue.isEmpty()) {
            System.out.println(copyQueue.poll());
        }
    }
}

        // 23. Write a piece of code that finds and prints the longest string in a stack
        // of strings.

        // For example, in the stack [hello, hi, goodbye, howdy], the longest string is
        // "goodbye". When your code is done running, the stack should still contain the
        // same contents as it had at the start. In other words, if you destroy the
        // stack as you examine it, restore its state afterward. If you like, put your
        // code into a method called printLongest that accepts the stack as a parameter.

        import java.util.Stack;

public class LongestStringFinder {

    public static void main(String[] args) {
        // Example usage
        Stack<String> stringStack = new Stack<>();
        stringStack.push("hello");
        stringStack.push("hi");
        stringStack.push("goodbye");
        stringStack.push("howdy");

        // Call the printLongest method
        printLongest(stringStack);

        // Original stack still contains the same contents
        System.out.println("Original stack contents after finding the longest string:");
        System.out.println(stringStack);
    }

    public static void printLongest(Stack<String> stack) {
        // Create a copy of the original stack to avoid modifying it
        Stack<String> copyStack = new Stack<>();
        copyStack.addAll(stack);

        // Find the longest string
        String longestString = "";
        while (!copyStack.isEmpty()) {
            String currentString = copyStack.pop();
            if (currentString.length() > longestString.length()) {
                longestString = currentString;
            }
        }

        // Print the longest string
        System.out.println("Longest string in the stack: " + longestString);
    }
}


        // Exercises:

        // None

    }
}

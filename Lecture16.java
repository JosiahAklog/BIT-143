import java.util.List;

class Lecture16 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 16");

        // Self-Check Problems:
        // Section 16.3: A Complex List Operation

        // 26. What are the four cases examined in the addSorted method?
//Empty List (or Array):

//Insert at the Beginning:

//Insert in the Middle:

//Insert at the End:

        // 27. What is the “inchworm approach”?
        // What advantages does this approach have over other approaches for examining a
        // linked list?

        //The "inchworm approach" is a term used to describe a strategy for traversing or examining a linked list, particularly when you have two pointers moving through the list at different speeds. 

        // 28. Write methods called sum and average that return the sum of all values in
        // the list and the average value as a real number, respectively.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.sum() should return 63 and the call of list.average() should
        // return 10.5. If the list is empty, sum should return 0 and average should
        // return 0.0.
        
        def __init__(self, values=[]):
            self.values = values
    
        def sum(self):
            return sum(self.values)
    
        def average(self):
            if not self.values:
                return 0.0
            else:
                return sum(self.values) / len(self.values)
    
    
    my_list = CustomList([11, -7, 3, 42, 0, 14])
    sum_result = my_list.sum()
    average_result = my_list.average()
    
    print(f"Sum: {sum_result}")
    print(f"Average: {average_result}")
    
    
        // Section 16.4: An IntList Interface

        // 29. What are some advantages of creating an IntList interface and having both
        // types of lists implement it?
// Code Abstraction and Encapsulation:

//The IntList interface abstracts away the implementation details, providing a clear and concise contract for any class that implements it
//Code Consistency:

//By having both custom and built-in lists implement the same interface,

        // 30. Write a method called firstLast that can accept either type of integer
        // list as a parameter and that moves the first element of the list to the end.
        // For example, if a variable called list contains the values [12, 45, 78, 20,
        // 36], the call of firstLast(list); will change the list to store [45, 78, 20,
        // 36, 12].

        

        {
                // Example usage:
                List<Integer> myList = List.of(12, 45, 78, 20, 36);
                firstLast(myList);
                System.out.println(myList);  // Output: [45, 78, 20, 36, 12]
            }
        
            public static <T> void firstLast(List<T> list) {
                if (list != null && list.size() > 1) {
                    T firstElement = list.remove(0);
                    list.add(firstElement);
                }
            }
        }
        
        // Section 16.5: LinkedList<E>

        // 31. What are some changes that need to be made to the linked list class to
        // convert it from storing integers to storing objects of type E?
//odify the class declaration and instance variables to use the generic type <E>, update the Node class if applicable, and adjust constructors, methods, and iterators to work with the generic type E throughout the class implementation.

        // 32. Why is an iterator especially useful with linked lists?
// implemented as a pointer to a node, and contains operator overloads for the four usual iterator operations of dereference, increment, comparison, and assignment.

        // 33. What state does the linked list iterator store? How does the iterator
        // know if there are more elements left to examine?
//typically stores a reference to the current node in the linked list. The state of the iterator includes information about the current position within the list and allows the iterator to traverse the elements one by one.
        // Exercises:

        // 18. Write a method called doubleList that doubles the size of a list by
        // appending a copy of the original sequence to the end of the list.
        public class ListNode {
            int val;
            ListNode next;
        
            public ListNode(int val) {
                this.val = val;
            }
        
            public void doubleList() {
                if (this == null || this.next == null) {
                    // Handle empty list or list with only one node
                    return;
                }
        
                ListNode current = this;
                while (current.next != null) {
                    // Create a new node with the same value as the current node
                    ListNode newNode = new ListNode(current.val);
        
                    // Insert the new node after the current node
                    newNode.next = current.next;
                    current.next = newNode;
        
                    // Move to the next original node
                    current = newNode.next;
                }
            }
        
            // Helper method to print the elements of the list
            public void printList() {
                ListNode current = this;
                while (current != null) {
                    System.out.print(current.val + " ");
                    current = current.next;
                }
                System.out.println();
            }
        
            public static void main(String[] args) {
                // Example usage
                ListNode list = new ListNode(1);
                list.next = new ListNode(3);
                list.next.next = new ListNode(2);
                list.next.next.next = new ListNode(7);
        
                System.out.println("Original list:");
                list.printList();
        
                list.doubleList();
        
                System.out.println("List after doubling:");
                list.printList();
            }
        }
        
        // For example, if a variable list stores the values [1, 3, 2, 7] and we make
        // the call of list.doubleList(); then after the call it should store [1, 3, 2,
        // 7, 1, 3, 2, 7]. Notice that the list has been doubled in size by having the
        // original sequence appear twice in a row. You may not make assumptions about
        // how many elements are in the list. You may not call any methods of the class
        // to solve this problem. If the original list contains N nodes, then you should
        // construct exactly N nodes to be added. You may not use any auxiliary data
        // structures such as arrays or ArrayLists to solve this problem. Your method
        // should run in O(N) time where N is the number of nodes in the list.

        // 19. Write a method called rotate that moves the value at the front of a list
        // of integers to the end of the list.
        public class LinkedList {
            static class Node {
                int data;
                Node next;
        
                public Node(int data) {
                    this.data = data;
                    this.next = null;
                }
            }
        
            private Node head;
        
            public LinkedList() {
                this.head = null;
            }
        
            // Method to rotate the list
            public void rotate() {
                if (head == null || head.next == null) {
                    // If the list has 0 or 1 element, no effect on the list
                    return;
                }
        
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
        
                // Move the first element to the end
                current.next.next = head;
                head = current.next;
                current.next = null;
            }
        
            // Method to print the list
            public void printList() {
                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }
        
            // Method to add a new node to the list
            public void addNode(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                } else {
                    Node current = head;
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = newNode;
                }
            }
        
           
            
        // For example, if a variable called list stores the values [8, 23, 19, 7, 45,
        // 98, 102, 4], then the call of list.rotate(); should move the value 8 from the
        // front of the list to the back of the list, changing the list to store [23,
        // 19, 7, 45, 98, 102, 4, 8]. If the method is called for a list of 0 elements
        // or 1 element, it should have no effect on the list. You may neither construct
        // any new nodes to solve this problem nor change any of the data values stored
        // in the nodes. You must solve the problem by rearranging the links of the
        // list.

        // 21.  Write a method called surroundWith that takes an integer x and an
        // integer y as parameters and surrounds all nodes in the list containing the
        // value x with new nodes containing the value y.
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void surroundWith(int x, int y) {
        if (head == null) {
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data == x) {
                Node newBefore = new Node(y);
                Node newAfter = new Node(y);

                // Insert newBefore before the current node
                if (prev != null) {
                    prev.next = newBefore;
                } else {
                    // If current is the head, update the head
                    head = newBefore;
                }

                newBefore.next = current;

                // Move to the newAfter
                current = newBefore.next;
                while (current.next != null) {
                    current = current.next;
                }

                // Insert newAfter after the current node
                current.next = newAfter;
                newAfter.next = current.next;

                // Move to the node after newAfter
                current = newAfter.next;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(1);
        list1.append(2);
        list1.append(1);

        LinkedList list2 = new LinkedList();
        list2.append(0);
        list2.append(1);
        list2.append(0);

        LinkedList list3 = new LinkedList();
        list3.append(0);
        list3.append(1);
        list3.append(2);

        list1.display();
        list1.surroundWith(1, 4);
        list1.display();

        list2.display();
        list2.surroundWith(1, 1);
        list2.display();

        list3.display();
        list3.surroundWith(3, 4);
        list3.display();
    }
}

        // In particular, each node that contains the value x as data should have a new
        // node just before it and just after it that each contain the value y. If no
        // nodes in the list contain the value x, then the list should not be modified.
        // For example, suppose that the variables list1, list2, and list3 store the
        // following sequences of values:

        // [0, 1, 2, 1]    // stored in list1
        // [0, 1, 0]       // stored in list2
        // [0, 1, 2]       // stored in list3

        // and we make the following calls:

        // list1.surroundWith(1, 4);   // surround 1s with 4s
        // list2.surroundWith(1, 1);   // surround 1s with 1s
        // list3.surroundWith(3, 4);   // surround 3s with 4s

        // then the variables will now store these sequences:

        // [0, 4, 1, 4, 2, 4, 1, 4]    // stored in list1
        // [0, 1, 1, 1, 0]             // stored in list2
        // [0, 1, 2]                   // stored in list3

        // 22. Write a method called reverse that reverses the order of the elements in
        // the list.
        // (This is very challenging!) For example, if the variable list initially
        // stores the values [1, 8, 19, 4, 17], the call of list.reverse(); should
        // change the list to store [17, 4, 19, 8, 1].
        class Node {
            int data;
            Node next;
        
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        
        class LinkedList {
            Node head;
        
            public void append(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    return;
                }
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        
            public void display() {
                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }
        
            public void reverse() {
                Node prev = null;
                Node current = head;
                Node next = null;
        
                while (current != null) {
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }
        
                // Update the head to the last node, which is now the first
                head = prev;
            }
        }
        
        public class Main {
            public static void main(String[] args) {
                LinkedList list = new LinkedList();
                list.append(1);
                list.append(8);
                list.append(19);
                list.append(4);
                list.append(17);
        
                System.out.println("Original list:");
        list.display();

        System.out.println("Reversed list:");
        list.reverse();
        list.display();
            }

        }
        
    }

}
        
    


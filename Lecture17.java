class Lecture17 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 17");

        // Self-Check Problems:
        // Section 17.2: Tree Traversals

        // 9. Write a method called printMirror that could be added to the IntTree class
        // and that prints a backward inorder traversal of the tree.
        // That is, for a given node, it examines the right subtree, then the node
        // itself, then the left subtree.
        class IntTreeNode {
            public int data;
            public IntTreeNode left;
            public IntTreeNode right;
        
            public IntTreeNode(int data) {
                this(data, null, null);
            }
        
            public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }
        
        class IntTree {
            private IntTreeNode overallRoot;
        
            // Constructors and other methods for building the tree are assumed to be present.
        
            // Method to print backward inorder traversal (right, node, left)
            public void printMirror() {
                printMirror(overallRoot);
                System.out.println();  // Print a newline after the traversal
            }
        
            private void printMirror(IntTreeNode root) {
                if (root != null) {
                    printMirror(root.right);
                    System.out.print(root.data + " ");
                    printMirror(root.left);
                }
            }
        }
        
        public class Main {
            public static void main(String[] args) {
                // Example usage
                IntTree tree = new IntTree(/* Initialize your tree here */);
                tree.printMirror();
            }
        }
        


        // Section 17.3: Common Tree Operations

        // 10. Why do many recursive tree methods use a public/private pair?
        // What is the difference between the header of the public method and that of
        // the private method?
// The use of a public/private pair in recursive tree methods is a design pattern that leverages encapsulation and abstraction in object-oriented programming. This pattern is common in situations where a recursive algorithm is applied to a tree structure
    

        // 11. Write a method called size that could be added to the IntTree class and
        // that returns the total number of nodes in the tree.
        class IntTreeNode {
            public int data;
            public IntTreeNode left;
            public IntTreeNode right;
        
            public IntTreeNode(int data) {
                this(data, null, null);
            }
        
            public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }
        
        class IntTree {
            private IntTreeNode overallRoot;
        
            // Constructors and other methods for building the tree are assumed to be present.
        
            // Method to get the total number of nodes in the tree
            public int size() {
                return size(overallRoot);
            }
        
            private int size(IntTreeNode root) {
                if (root == null) {
                    return 0;
                } else {
                    // Count the current node and recursively count nodes in the left and right subtrees
                    return 1 + size(root.left) + size(root.right);
                }
            }
        }
        
        public class Main {
            public static void main(String[] args) {
                // Example usage
                IntTree tree = new IntTree(/* Initialize your tree here */);
                int totalNodes = tree.size();
                System.out.println("Total number of nodes in the tree: " + totalNodes);
            }
        }
        

        // 12. Write methods called min and max that could be added to the IntTree class
        // and that return the smallest and largest values in the tree, respectively.
        // For example, if a variable called tree stores the values shown in Self-Check
        // Problem 5, the call of tree.min() should return –2 and the call of tree.max()
        // should return 94. If the tree is empty, the methods should throw an
        // IllegalStateException.


class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;

    public IntTreeNode(int data) {
        this(data, null, null);
    }

    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class IntTree {
    private IntTreeNode overallRoot;

    // Constructors and other methods for building the tree are assumed to be present.

    // Method to get the smallest value in the tree
    public int min() {
        if (overallRoot == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return min(overallRoot);
    }

    private int min(IntTreeNode root) {
        // Traverse to the leftmost node to find the smallest value
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Method to get the largest value in the tree
    public int max() {
        if (overallRoot == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return max(overallRoot);
    }

    private int max(IntTreeNode root) {
        // Traverse to the rightmost node to find the largest value
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        IntTree tree = new IntTree(/* Initialize your tree here */);

        try {
            int minValue = tree.min();
            System.out.println("Smallest value in the tree: " + minValue);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int maxValue = tree.max();
            System.out.println("Largest value in the tree: " + maxValue);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


        // Section 17.4: Binary Search Trees

        // 14. What is the difference between a regular binary tree and a binary search
        // tree?
        // lies in the way the elements are organized or arranged within the tree structure.

        // 16.  What will be true about the results of an inorder traversal of a binary
        // search tree?
        //Traverse the left subtree.
//Visit the current node.
//Traverse the right subtree.

        // For each of the next four problems, draw the binary search tree that would
        // result if the given elements were added to an empty binary search tree in the
        // given order. Then write the elements of the tree in the order that they would
        // be visited by each kind of traversal (preorder, inorder, and postorder).

        // 17. Leia, Boba, Darth, R2D2, Han, Luke, Chewy, Jabba
        //Preorder Traversal:

//Visit the current node before its children.
//Preorder: Leia, Boba, Darth, Chewy, Han, Jabba, R2D2

//Inorder Traversal:

//Visit the left subtree, then the current node, and finally the right subtree.
//Inorder: Boba, Chewy, Darth, Han, Jabba, Leia, R2D2

//Postorder Traversal:

//Visit the children of the current node before the current node itself.
//Postorder: Chewy, Jabba, Han, R2D2, Darth, Boba, Leia

        // 18. Meg, Stewie, Peter, Joe, Lois, Brian, Quagmire, Cleveland
        //Preorder Traversal:

//Visit the current node before its children.
//Preorder: Meg, Joe, Lois, Stewie, Peter, Cleveland, Quagmire

//Inorder Traversal:

//Visit the left subtree, then the current node, and finally the right subtree.
//Inorder: Joe, Lois, Meg, Peter, Cleveland, Stewie, Quagmire

//Postorder Traversal:

//Visit the children of the current node before the current node itself.
//Postorder: Lois, Cleveland, Peter, Joe, Quagmire, Stewie, Meg

        // 19. Kirk, Spock, Scotty, McCoy, Chekov, Uhuru, Sulu, Khaaaan!
        //Preorder Traversal:

//Visit the current node before its children.
//Preorder: Kirk, Chekov, Spock, McCoy, Uhuru, Sulu, Khaaaan!

//Inorder Traversal:

//Visit the left subtree, then the current node, and finally the right subtree.
//Inorder: Chekov, Kirk, McCoy, Spock, Sulu, Uhuru, Khaaaan!

//Postorder Traversal:

//Visit the children of the current node before the current node itself.
//Postorder: Chekov, McCoy, Sulu, Uhuru, Khaaaan!, Spock, Kirk

        // 20. Lisa, Bart, Marge, Homer, Maggie, Flanders, Smithers, Milhouse
       // Preorder Traversal:

//Visit the current node before its children.
//Preorder: Lisa, Bart, Marge, Homer, Flanders, Milhouse, Smithers, Maggie

//Inorder Traversal:

//Visit the left subtree, then the current node, and finally the right subtree.
//Inorder: Bart, Lisa, Flanders, Homer, Marge, Milhouse, Smithers, Maggie

//Postorder Traversal:

//Visit the children of the current node before the current node itself.
//Postorder: Bart, Flanders, Homer, Smithers, Milhouse, Maggie, Marge, Lisa

        // 22. What is the x = change(x) pattern, and how is it used with binary trees?
//in a binary search tree, the x = change(x) pattern might be used to delete a node with a specific value or to balance the tree after an insertion, rotation, or other structural modification. The recursive nature of the pattern makes it well-suited for tasks that involve traversal and modification of tree structures.

        // 23. How many nodes at most would be examined in a call to contains on a
        // perfect binary search tree of height N?
        //in summary, for a perfect binary search tree of height 
//ℎ
//h, the maximum number of nodes examined in a contains operation is 
//ℎ
//+
//1
//h+1.

        // 24. Consider the following implementation of the contains method.

        // How does it differ from the one we showed in Section 17.4? Is it better or
        // worse, and why?

        // private boolean contains(IntTreeNode root, int value) {
        //     if (root == null) {
        //         return false;
        //     } else if (value == root.data) {
        //         return true;
        //     } else {
        //         return contains(root.left, value) || contains(root.right, value);
        //     }
        // }
        
//the "better" implementation depends on the specific requirements and characteristics of the binary tree in question. Both implementations are valid, and their performance may vary based on the distribution of values in the tree.
        
// 25. Rewrite the min and max methods from Self-Check Problem 12 so that they
        // will work on a binary search tree.
        // The methods should take advantage of the fact that the tree is sorted and
        // should not examine nodes unless necessary.

        class IntTreeNode {
            public int data;
            public IntTreeNode left;
            public IntTreeNode right;
        
            public IntTreeNode(int data) {
                this(data, null, null);
            }
        
            public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }
        
        class IntTree {
            private IntTreeNode overallRoot;
        
            // Constructors and other methods for building the tree are assumed to be present.
        
            // Method to get the minimum value in the binary search tree
            public int min() {
                if (overallRoot == null) {
                    throw new IllegalStateException("Tree is empty");
                }
                return min(overallRoot);
            }
        
            private int min(IntTreeNode root) {
                // Traverse to the leftmost node to find the minimum value
                while (root.left != null) {
                    root = root.left;
                }
                return root.data;
            }
        
            // Method to get the maximum value in the binary search tree
            public int max() {
                if (overallRoot == null) {
                    throw new IllegalStateException("Tree is empty");
                }
                return max(overallRoot);
            }
        
            private int max(IntTreeNode root) {
                // Traverse to the rightmost node to find the maximum value
                while (root.right != null) {
                    root = root.right;
                }
                return root.data;
            }
        }
        
        // Exercises:

        // None
    }
}

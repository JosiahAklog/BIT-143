/**
 * Lecture15
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Lecture15 {

    public static void main(String[] args) {
        // Replace this with the path to your image file
        String imagePath = "C:\\Users\\josia\\Desktop\\BIT 143\\answers.jpeg";

        openImage(imagePath);
    }

    public static void openImage(String imagePath) {
        try {
            File imageFile = new File(imagePath);

            // Check if Desktop is supported
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                // Check if the image file exists
                if (imageFile.exists()) {
                    desktop.open(imageFile);
                } else {
                    System.out.println("Image file not found: " + imagePath);
                }
            } else {
                System.out.println("Desktop not supported. Cannot open image.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        


}

        // NOTE NOTE NOTE
    
        // Several problems ask you to draw pictures / images. Here are some ideas for
        // how to do that:
        //
        // Some ideas for how to draw the images:
        // * Draw this out on paper, snap a picture with your phone
        //
        // * Capture a screenshot and then draw on it using MS Paint or MacOS Image
        // Preview, etc
        // (You'll need to Google for how to take the screenshot - it's not hard once
        // you know how, it's just well-hidden)
        //
        // * Use diagram-making software. You can find free online websites that let you
        // do this on the website
        //
        // * If you find other ways please do share! Especially if they're quick and
        // easy! :)

        //
        //
        // Some ideas for how to add the images to this repo:
        //
        // * Add the image files directly to the repo (in which case please name the
        // files
        // Question 5.png, or Answer 6.gif, or 7.jpeg, or whatever)
        //
        // * Embedding them in a Word /.DOC/.DOCX file
        //
        // * Embed them into a .PDF file (this is good for MacOS people - you can create
        // a .pages file, then export to .PDF)
        // (I can't open .pages files reliably on Windows)

        //
        // DO NOT DO THE FOLLOWING:
        //
        // * Do NOT upload to Google Drive / Dropbox / etc and then hand in a link.
        // I want to have copies of the work that you've done even after the quarter
        // ends

        //
        //
        //
        // Self-Check Problems:
        // Section 16.1: Working with Nodes

        // 1. What is the difference between a linked list and an array list? How are
        // they similar?

        //Linked lists are often preferred for frequent insertions and deletions, while array lists are suitable for scenarios where random access and efficient memory usage are crucial.

        // 2. What is the difference between a linked node and a linked list? How are
        // they related and connected?

        // 3. What value is stored as the next field of the last node of a list? What
        // value will a node’s next field have if none is specified?
//If a node's next field is not explicitly specified, it will usually have a default value of null in languages like Java, C++, and many others. 

        // 4. What happens if you or the client try to go past the last element in a
        // linked list? Be specific.

        //If you or the client attempt to go past the last element in a linked list, you will typically encounter a null reference or a similar indication that there is no next element. 
        // QUESTIONS 5- 17:
        // Please put these into a separate file(s), as described in this file above
      // Example Java code referencing an image
    
       

        // Section 16.2: A Linked List Class
        // 18. What are the two ways to change the contents of a linked list?

        // 19. An element can be inserted at or removed from the beginning, middle, or
        // end of a linked list.
        // Which of the three locations is the most computationally expensive, and why?
        // How does this compare against the result for an array list?

        //In a linked list, the most computationally expensive operation is typically removing an element from the middle. This is because, in order to remove an element, you need to traverse the list to find the element you want to remove.
//Beginning middle and ENd

        // 20. When you add or remove the element found at index i of a list, you must
        // create a temporary current node reference and advance it through the list.
        // At which index’s node should the loop stop, relative to i?

        //So, if you're adding or removing an element at index i, you stop the loop when you reach the node at index i - 1 because you need to manipulate the pointers of the node at index i - 1 to connect it correctly with the new node or the next node after the removal.

        // 21. In an array list, it is possible to overrun the capacity of the array, at
        // which point the list must be resized to fit.
        // Is resizing necessary on a linked list? What limits the number of elements
        // that a linked list can have?

        //linked lists do not require resizing in the same way as array lists, and the number of elements a linked list can have is primarily limited by the available memory on the system.

        // QUESTIONS 21-24:
        // Please put these into a separate file(s), as described in this file above

        // Exercises:
        // None

    






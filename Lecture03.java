
import java.util.*;
class Lecture03 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 03");
         Scanner scanner = new Scanner(System.in);


        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 21. Consider the following variable declarations:
        // Integer n1 = 15;
        // Integer n2 = 7;
        // Integer n3 = 15;
        // String s1 = "computer";
        // String s2 = "soda";
        // String s3 = "pencil";

        // Indicate whether the result of each of the following comparisons is positive,
        // negative, or 0:

        // A: Positive 
        // n1.compareTo(n2)
        // B: 0
        // n3.compareTo(n1)
        // C:Negative
        // n2.compareTo(n1)
        // D:negative
        // s1.compareTo(s2)
        // E:Postive
        // s3.compareTo(s1)
        // F:0
        // s2.compareTo(s2)

        // 22. Use the compareTo method to write code that reads two names from the
        // console and prints the one that comes first in alphabetical order. For
        // example, the program’s output might look like the following:

         System.out.print("Type a name: ");
        String name1 = scanner.nextLine();

        System.out.print("Type another name: ");
        String name2 = scanner.nextLine();

        int comparisonResult = name1.compareTo(name2);

        if (comparisonResult < 0) {
            System.out.println(name1 + " goes before " + name2);
        } else if (comparisonResult > 0) {
            System.out.println(name2 + " goes before " + name1);
        } else {
            System.out.println("Both names are equal.");
        }

      
    }

       

    
        // Type a name: Tyler Durden
        // Type a name: Marla Singer
        // Marla Singer goes before Tyler Durden

        // 23. Write code to read a line of input from the user and print the words of
        // that line in sorted order, without removing duplicates. For example, the
        // program output might look like the following:
      
        System.out.println("Type a message to sort: ");
        String message1 = scanner.nextLine();

        String [] words = message1.split(" ");
        Arrays.sort(words);

        System.out.print(" Your message sorted: ");
        for (String word : words) {
            System.out.print(word + " ");
        }

        scanner.close();
    }



        // Type a message to sort:  to be or not to be that is the question
        // Your message sorted: be be is not or question that the to to

        // EXERCISES:
         public class CalendarDate implements Comparable<CalendarDate> {
     private int month;
     private int day;
     private int year;

     public CalendarDate(int year, int mouth, int year) {
        this.year;
        this.mouth;
        this.day;
        
     }

     // Compares this calendar date to another date.
     // Dates are compared by month and then by day.
     public int compareTo(CalendarDate other) {
         if (year != other.year){
            return year - other.year;}
         
         else if (month != other.month) {
       }   
             return month – other.month;
         } else {
             return day – other.day;
         }
     }

     public int getMonth() {
         return month;
     }

     public int getDay() {
         return day;
     }

     public String toString() {
         return month + "/" + day;
     }

        // None


    


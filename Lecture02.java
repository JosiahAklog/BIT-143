import java.util.ArrayList;

class Lecture02 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 02");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here: An array list is a program in java that acts like libaray that collects framework. It can grow or shrink in size as needed. Unlike traditional array which is fixed.
        //You should use an "arraylist" when you dont know the size or the number of elements to store and if you can frequaletly change the size. This also cancels the use of using code like "add,remove,get"
        // 1. What is an ArrayList? In what cases should you use an ArrayList rather
        // than an array?

        // Put your answer for #3 here:
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("It");
        wordList.add("was");
        wordList.add("a");
        wordList.add("stormy");
        wordList.add("night");

        // Getting the size of the ArrayList
        int size = wordList.size();

        // Printing the ArrayList and its size
      //   System.out.println("ArrayList: " + wordList);
        System.out.println("Size of the ArrayList: " + size);


        // 3. Write the code to declare an ArrayList containing these elements. What is
        // the size of the list? What is its type?
        // 5

        // Put your answer for #4 here:
        wordList.add(3,"dark");
        wordList.add(4,"and");
         //System.out.println("ArrayList: " + wordList);
    

        // 4. Write code to insert two additional elements, "dark" and "and", at the
        // proper places in the list to produce the following ArrayList as the result:
        // ["It", "was", "a", "dark", "and", "stormy", "night"]
        

        // Put your answer for #5 here:
        // 5. Write code to change the second element’s value to "IS", producing the
        // following ArrayList as the result:
        // ["It", "IS", "a", "dark", "and", "stormy", "night"]
        wordList.add(1,"IS");
        System.out.println("ArrayList: " + wordList);
    



        // Put your answer for #7 here:
         ArrayList<Integer> multiplesOfTwo = new ArrayList<Integer>();

        // Use a loop to fill the list with multiples of 2
        for (int i = 0; i <= 18; i += 2) {
            multiplesOfTwo.add(i);
        }

        // Printing the ArrayList
        System.out.println("Multiples of Two ArrayList: " + multiplesOfTwo);
    


        // 7. Write code to declare an ArrayList holding the first 10 multiples of 2: 0,
        // 2, 4,..., 18. Use a loop to fill the list with the proper elements.

        // Put your answer for #9 here:
    }
        string_list = ["It", "IS", "a", "dark", "and", "stormy", "night"]

//# Change the second element to "IS"
string_list[1] = "IS"

//# Print the modified list
print(string_list)

//# Check if the list contains "IS"
contains_is = "IS" in string_list

if contains_is:
    print("The list contains 'IS'")
else:
    print("The list does not contain 'IS'")
    }
        // 9. Write code to print out whether or not a list of Strings contains the
        // value "IS". Do not use a loop.

        // Put your answer for #14 here: functionality of a primitive data type (like int, float, char) and allows it to be treated as an object.
        // 14. What is a wrapper class? Describe the difference between an int and an
        // Integer.

        // Put your answer for #13 here: An int is an It does not have methods or behaviors associated with it.int is used for simple numeric calculation
        // An interger is a wrapper class is used when you need to treat an int as an object or when you want to leverage the methods provided by the wrapper class

        // 13. The code that follows does not compile. Why not? Explain how to fix it.
       // DOES not compile because you cannot use primitive data types like int as type arguments for generic 

        // ArrayList<int> numbers = new ArrayList<>();
        // numbers.add(7);
        // numbers.add(19);
        // System.out.println(numbers);

        // Put your answer for #15 here: 
        // A. 2,6,1,8
        // B. 20,10,40,30,20,60,50
        // C. -4, 9, 1, 25, 4, 16, 64, 36, 49
        

        // A. [2, 6, 1, 8]
        // B. [30, 20, 10, 60, 50, 40]
        // C. [-4, 16, 9, 1, 64, 25, 36, 4, 49]
    


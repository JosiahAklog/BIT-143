class Lecture08 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 08");

        // SELF-CHECK PROBLEMS:
        // Section 13.1: Searching and Sorting in the Java Class Libraries
        // 3. Should you use a sequential or binary search on an array of Point objects,
        // and why?

        //So, if your array of Point objects is sorted based on some criteria (e.g., x-coordinate or y-coordinate), then a binary search would be more efficient. 

        // 4. Under what circumstances can the Arrays.binarySearch and
        // Collections.binarySearch methods be used successfully?

        //binary search is most efficient when the data is already sorted, so if you frequently add or remove elements from the data

        // 5. In what order does the Collections.sort method arrange a list of strings?
        // How could you arrange them into a different order?
        //apple"
//"Banana"
//"cherry"
//"banana"
//Sorted List:

//"Banana"
//"apple"
//"banana"
//"cherry"

        // Section 13.2: Program Complexity
        // 9. Approximate the runtime of the following code fragment listed in Canvas
        // complexity of this code is O(log n)

        // 10. Approximate the runtime of the following code fragment listed in Canvas
        // loop iterates from 1 to "n-1," which means it executes "n-1" times

        // 11. Approximate the runtime of the following code fragment listed in Canvas
        // second loop runs for a fixed number of iterations (in this case, 100), so it's considered a constant factor

        // Section 13.3: Implementing Searching and Sorting Algorithms
        // 16. What is the runtime complexity class of a sequential search on an
        // unsorted array?
        // What is the runtime complexity class of the modified sequential search on a
        // sorted array?

        //The runtime complexity class of a sequential search on an unsorted array is O(n), where "n" represents the number of elements in the array. 
        //The runtime complexity class of the modified sequential search on a sorted array is still O(n) because, even though the array is sorted, the algorithm may still need to examine all the elements in the array to find the target element. 

        // 17. Why does the binary search algorithm require the input to be sorted?
        //The binary search algorithm requires the input to be sorted because the algorithm relies on repeatedly dividing the search range in half.

        // 18. How many elements (at most) does a binary search examine if the array
        // contains 60 elements?

        //This means that at most 6 elements would be examined in a binary search of an array containing 60 elements

        // 19. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input arrays?
        // What value will the binary search algorithm return?

        // A. int[] numbers = {1, 3, 6, 7, 8, 10, 15, 20, 30};
        //8
        // B. int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        //4
        // C. int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //7
        // D. int[] numbers = {8, 9, 12, 14, 15, 17, 19, 25, 31};
        //1

        // 20. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input array?
        // Notice that the input array isn’t in sorted order. What can you say about the
        // binary search algorithm’s result?

        // int[] numbers = {6, 5, 8, 19, 7, 35, 22, 11, 9};
// where the array is not sorted, applying the binary search algorithm will not guarantee a reliable result.

        // 23. What modifications would you have to make to the selectionSort method to
        // cause it to sort an array of double values rather than one of integer values?
       
        public static void selectionSort(double[] arr) {
            // Your sorting logic here
        }
        

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the elements
            double temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        

        // 24. Consider the following array:

        // int[] numbers = {29, 17, 3, 94, 46, 8, –4, 12};
        // After a single pass of the selection sort algorithm (a single swap), what
        // would be the state of the array?

        // A. {–4, 29, 17, 3, 94, 46, 8, 12}
        // B. {29, 17, 3, 94, 46, 8, 12}
        // C. {–4, 29, 17, 3, 94, 46, 8, –4, 12}
        // D. {–4, 17, 3, 94, 46, 8, 29, 12}
        // E. {3, 17, 29, 94, –4, 8, 46, 12}

        //{–4, 17, 3, 94, 46, 8, 29, 12}



        // 25. Trace the execution of the selection sort algorithm as shown in this
        // section when run on the following input arrays.
        // Show each element that will be selected by the algorithm and where it will be
        // moved, until the array is fully sorted.
//A
//  First pass: The algorithm selects -4 as the minimum and swaps it with 29.
//Result: {-4, 17, 3, 94, 46, 8, 29, 12}

//Second pass: The algorithm selects 3 as the minimum and swaps it with 17.
//Result: {-4, 3, 17, 94, 46, 8, 29, 12}

//Third pass: The algorithm selects 8 as the minimum and swaps it with 17.
//Result: {-4, 3, 8, 94, 46, 17, 29, 12}

//Fourth pass: The algorithm selects 12 as the minimum and swaps it with 17.
//Result: {-4, 3, 8, 12, 46, 94, 29, 17}
//B
//{33, 14, 3, 95, 47, 9, -42, 13}
//First pass: The algorithm selects -42 as the minimum and swaps it with 33.
//Result: {-42, 14, 3, 95, 47, 9, 33, 13}

//Second pass: The algorithm selects 3 as the minimum and swaps it with 14.
//Result: {-42, 3, 14, 95, 47, 9, 33, 13}

//Third pass: The algorithm selects 9 as the minimum and swaps it with 14.
//Result: {-42, 3, 9, 95, 47, 14, 33, 13}

//Fourth pass: The algorithm selects 13 as the minimum and swaps it with 14.
//Result: {-42, 3, 9, 13, 47, 14, 33, 95}

//C
//{7, 1, 6, 12, -3, 8, 4, 21, 2, 30, -1, 9}
//The selection sort algorithm proceeds as follows:
//Result: {-3, 1, 6, 12, 7, 8, 4, 21, 2, 30, -1, 9}
//Result: {-3, -1, 6, 12, 7, 8, 4, 21, 2, 30, 1, 9}
//Result: {-3, -1, 1, 12, 7, 8, 4, 21, 2, 30, 6, 9}
//Result: {-3, -1, 1, 2, 7, 8, 4, 21, 12, 30, 6, 9}
//Result: {-3, -1, 1, 2, 4, 8, 7, 21, 12, 30, 6, 9}

//D
//{6, 7, 4, 8, 11, 1, 10, 3, 5, 9}
//The selection sort algorithm proceeds as follows:
//Result: {1, 7, 4, 8, 11, 6, 10, 3, 5, 9}
//Result: {1, 3, 4, 8, 11, 6, 10, 7, 5, 9}
//Result: {1, 3, 4, 8, 11, 6, 10, 7, 5, 9}
//Result: {1, 3, 4, 5, 11, 6, 10, 7, 8, 9}
//Result: {1, 3, 4, 5, 6, 11, 10, 7, 8, 9}
//Result: {1, 3, 4, 5, 6, 7, 10, 11, 8, 9}
//Result: {1, 3, 4, 5, 6, 7, 8, 11, 10, 9}
//Result: {1, 3, 4, 5, 6, 7, 8, 9, 10, 11}

        // A. {29, 17, 3, 94, 46, 8, –4, 12}
        // B. {33, 14, 3, 95, 47, 9, –42, 13}
        // C. {7, 1, 6, 12, –3, 8, 4, 21, 2, 30, –1, 9}
        // D. {6, 7, 4, 8, 11, 1, 10, 3, 5, 9}
    }
}

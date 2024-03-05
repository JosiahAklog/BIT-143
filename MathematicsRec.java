import java.util.Arrays;
import java.util.Scanner;

class MathematicsRec {
    public static long eduodd(long n) {
        if (n == 0) {
            return 1; // Adjusted for the case where n=0
        }

        StringBuilder result = new StringBuilder();
        String numStr = Long.toString(Math.abs(n));

        for (char digit : numStr.toCharArray()) {
            int digitValue = Character.getNumericValue(digit);
            if (digitValue % 2 == 0) {
                result.append(digitValue + 1);
            } else {
                result.append(digitValue - 1);
            }
        }

        // Remove leading zeros
        String resultStr = result.toString().replaceFirst("^0+", "");

        if (resultStr.isEmpty()) {
            return 0;
        }

        // Apply the sign to the result
        return Long.parseLong(resultStr) * (n < 0 ? -1 : 1);
    }
    public static int fibby(int n) {
        if (n == 0) {
            return 1;
        } else if (n <= 2) {
            return n + 1;
        } else {
            int floorNOver4 = n / 4;
            int floor3NOver4 = (3 * n) / 4;
            return fibby(floorNOver4) + fibby(floor3NOver4);
        }
    }
    
    public static void stg(int start, int end) {
        int prevFibby = -1;
        for (int n = start; n <= end; n++) {
            int fibbyValue = fibby(n);
            // Print Fibonacci number if it's different from the previous one
            if (fibbyValue != prevFibby) {
                System.out.println(n + " " + fibbyValue);
                prevFibby = fibbyValue;
            }
        }
    }
    

    public static double median3(int[] arr) {
        int length = arr.length;

        if (length == 1) {
            return arr[0];
        } else if (length == 2) {
            return (arr[0] + arr[1]) / 2.0;
        } else {
            int partSize;
            int remainder = length % 3;

            if (remainder == 0) {
                partSize = length / 3;
            } else if (remainder == 1) {
                partSize = length / 3;
            } else {
                partSize = (length / 3) + 1;
            }

            int[] firstPart = Arrays.copyOfRange(arr, 0, partSize);
            int[] lastPart = Arrays.copyOfRange(arr, length - partSize, length);
            int[] middlePart = Arrays.copyOfRange(arr, partSize, length - partSize);

            double median1 = median3(firstPart);
            double median2 = median3(middlePart);
            double median3 = median3(lastPart);

            double[] medians = { median1, median2, median3 };
            Arrays.sort(medians, 0, 3);  // Sort the first 3 elements

            return medians[1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the range [start, end]
        System.out.println("Enter the start value:");
        int start = scanner.nextInt();

        System.out.println("Enter the end value:");
        int end = scanner.nextInt();

        // Generate and print consecutive values of n and fibby(n)
        System.out.println("Sparse Table Generation:");
        stg(start, end);

        scanner.close();
    
        
        // Example usage
        long result1 = eduodd(987654321);
        long result2 = eduodd(-8443);
        long result3 = eduodd(11121113);
        long result4 = eduodd(-27);
        long result5 = eduodd(27);
        long result6 = eduodd(0);
        long result7 = eduodd(123456789);
        long result8 = eduodd(987654321);
        long result9 = eduodd(13579);
        long result10 = eduodd(0);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);


    

        int[] array = { 3, 7, 1, 5, 2, 4, 8, 6 };
        System.out.println("Median: " + median3(array));

        long[] testNumbers = { 0, 27, -8443, 987654321, 11121113, -11, 1024, -987654321 };

        for (long number : testNumbers) {
            long result = eduodd(number);
            System.out.println(number + " -> " + result);
        }
    }

    }




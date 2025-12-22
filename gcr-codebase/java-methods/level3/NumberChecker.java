import java.util.*;

public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store the digits of the number in an array
    public static int[] getDigitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }

    // Method to check if a number is a duck number
    // Duck number: contains at least one '0' digit (but not starting with 0)
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // skip first digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int[] digits, int num) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    // Method to find largest and second largest digits
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Get digits array
        int[] digits = getDigitsArray(num);

        // Display digit count
        System.out.println("Count of digits: " + countDigits(num));

        // Display digits
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Check Duck number
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        // Check Armstrong number
        System.out.println("Is Armstrong Number? " + isArmstrong(digits, num));

        // Largest and second largest
        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second Largest digit: " + largestTwo[1]);

        // Smallest and second smallest
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second Smallest digit: " + smallestTwo[1]);

        sc.close();
    }
}
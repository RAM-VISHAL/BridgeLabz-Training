import java.util.*;

public class NumberChecker3{

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
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

        // Reverse digits
        int[] reversed = reverseArray(digits);
        System.out.print("Reversed digits array: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Compare arrays
        System.out.println("Digits and reversed arrays equal? " + arraysEqual(digits, reversed));

        // Palindrome check
        System.out.println("Is Palindrome? " + isPalindrome(digits));

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        sc.close();
    }
}
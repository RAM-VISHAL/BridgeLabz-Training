import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input from user
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", ""); // normalize: ignore case & spaces
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to display result
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);
        boolean result = isPalindrome(input);
        displayResult(input, result);

        sc.close();
    }
}
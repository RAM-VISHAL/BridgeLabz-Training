import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Using substring with start > end
        System.out.println("Substring: " + input.substring(5, 2));
        // This line will throw IllegalArgumentException
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String input) {
        try {
            // Attempting invalid substring
            System.out.println("Substring: " + input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            // Handling specific exception
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index!");
        } catch (RuntimeException e) {
            // Handling any other runtime exception
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        System.out.println(" Generating Exception ");
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println(" Handling Exception ");
        handleException(userInput);

        sc.close();
    }
}
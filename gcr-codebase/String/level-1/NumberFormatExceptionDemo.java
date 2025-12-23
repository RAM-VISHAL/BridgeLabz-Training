import java.util.Scanner;

public class NumberFormatExceptionDemo {

    //  Generates Runtime Exception (No try-catch)
    public static void generateException(String text) {
        System.out.println("Generating NumberFormatException : ");
        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    //  Handles Runtime Exception using try-catch
    public static void handleException(String text) {
        System.out.println("Handling Exception using try-catch...");
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Caught: " + e);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a value: ");
        String input = sc.next();

        // Calling method to generate exception
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program stopped due to Runtime Exception!");
        }

        // Calling method to handle exception
        handleException(input);

        sc.close();
    }
}

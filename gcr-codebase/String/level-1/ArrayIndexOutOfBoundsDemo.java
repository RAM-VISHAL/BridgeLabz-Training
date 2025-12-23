import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Generates Runtime Exception (No try-catch)
    public static void generateException(String[] names) {
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        // Accessing index beyond array length
        System.out.println("Name: " + names[names.length]);
    }

    //  Handles Runtime Exception using try-catch
    public static void handleException(String[] names) {
        System.out.println("\nHandling Exception using try-catch...");
        try {
            System.out.println("Name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Caught: " + e);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        // Defining array of names
        String[] names = new String[size];

        // Taking array input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Calling method to generate exception
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Program stopped due to Runtime Exception!");
        }

        // Calling method to handle exception
        handleException(names);

        sc.close();
    }
}

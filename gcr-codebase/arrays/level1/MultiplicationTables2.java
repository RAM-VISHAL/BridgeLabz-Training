import java.util.*;

public class MultiplicationTables2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter a number between 6 and 9: ");
        int number = sc.nextInt();

        // Step 2: Validate input
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            return;
        }

        // Step 3: Define array to store multiplication results
        int[] multiplicationResult = new int[10];  // for 1 to 10

        // Step 4: Calculate multiplication table and store in array
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // Step 5: Display results
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }
    }
}
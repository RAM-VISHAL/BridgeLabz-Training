import java.util.*;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array of 10 elements and supporting variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Step 2: Infinite loop for user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // Step 3: Break conditions
            if (num <= 0) {
                break; // stop if 0 or negative
            }
            if (index == 10) {
                break; // stop if array is full
            }

            // Step 4: Store number in array and increment index
            numbers[index] = num;
            index++;
        }

        // Step 5: Calculate total and display all numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Step 6: Display total
        System.out.println("Sum of all numbers = " + total);
    }
}
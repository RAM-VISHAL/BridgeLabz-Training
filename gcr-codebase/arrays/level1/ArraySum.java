import java.util.Scanner;

public class ArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Create array and variables
        double[] numbers = new double[10]; // array of 10 elements
        double total = 0.0;                // sum initialized to 0
        int index = 0;                     // index starts at 0

        //  Infinite loop for user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Break conditions
            if (input <= 0) {
                break; // stop if user enters 0 or negative
            }
            if (index == 10) {
                break; // stop if array is full
            }

            //  Store value in array
            numbers[index] = input;
            index++;
        }

        //  Calculate sum using for loop
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        //  Display all values and total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Sum of all numbers = " + total);

        sc.close();
    }
}
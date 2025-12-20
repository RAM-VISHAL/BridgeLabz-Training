import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Define an array to store results
        int table[] = new int[10];

        // Step 3: Run loop from 1 to 10 and store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;  // store result in array
        }

        // Step 4: Display results in format number * i = result
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
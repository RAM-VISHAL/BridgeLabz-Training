import java.util.*;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if it's a natural number
        if (n > 0) {
            // Compute using formula: sum = n*(n+1)/2
            int formulaSum = n * (n + 1) / 2;

            // Compute using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
             
           // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both results match!");
            } else {
                System.out.println(" Results do not match.");
            }
        } else {
            System.out.println("Please enter a valid Natural Number (greater than 0).");
        }

        
    }
}

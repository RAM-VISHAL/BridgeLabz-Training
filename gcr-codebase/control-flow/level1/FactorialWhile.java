import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Check if the number is valid
        if (num < 0) {
            System.out.println("Sorry, factorial does not exist for negative numbers.");
        } else if (num == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            int i = 1;
            long factorial = 1;  // use long to handle larger results

            // Compute factorial using while loop
            while (i <= num) {
                factorial *= i;
                i++;
            }

            // Print result
            System.out.println("The factorial of " + num + " is " + factorial);
        }

      
    }
}
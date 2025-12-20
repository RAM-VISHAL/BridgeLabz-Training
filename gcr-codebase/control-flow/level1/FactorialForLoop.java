import java.util.Scanner;

public class FactorialForLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take integer input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        //  Check for natural number
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Step 3: Calculate factorial using for loop
            long factorial = 1;  // use long to handle large results
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Step 4: Print result
            System.out.println("The factorial of " + n + " is " + factorial);
        }

        sc.close();
    }
}
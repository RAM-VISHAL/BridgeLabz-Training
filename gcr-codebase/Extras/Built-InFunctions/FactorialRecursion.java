import java.util.Scanner;

public class FactorialRecursion {

    // Function to take input from user
    public static int takeInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive case
    }

    // Function to display result
    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = takeInput(sc);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            displayResult(number, result);
        }

        sc.close();
    }
}
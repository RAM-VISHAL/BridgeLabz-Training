import java.util.Scanner;

public class GCDLCMCalculator{

    // Function to take input
    public static int takeInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using GCD
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Function to display results
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = takeInput(sc, "Enter first number: ");
        int num2 = takeInput(sc, "Enter second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        displayResult(num1, num2, gcd, lcm);

        sc.close();
    }
}
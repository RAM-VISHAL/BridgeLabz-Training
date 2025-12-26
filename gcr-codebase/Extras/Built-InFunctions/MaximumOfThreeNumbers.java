import java.util.*;

public class MaximumOfThreeNumbers {

    // Function to take input from user
    public static int takeInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Function to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers:");

        int num1 = takeInput(sc, "Enter first number: ");
        int num2 = takeInput(sc, "Enter second number: ");
        int num3 = takeInput(sc, "Enter third number: ");

        int maximum = findMaximum(num1, num2, num3);

        System.out.println("The maximum of the three numbers is: " + maximum);

        sc.close();
    }
}
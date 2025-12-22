import java.util.*;

public class NumberChecker5{

    // Method to calculate sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        return sumOfDivisors(num) == num;
    }

    // Method to check if a number is abundant
    public static boolean isAbundant(int num) {
        if (num <= 0) return false;
        return sumOfDivisors(num) > num;
    }

    // Method to check if a number is deficient
    public static boolean isDeficient(int num) {
        if (num <= 0) return false;
        return sumOfDivisors(num) < num;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Is Perfect Number? " + isPerfect(num));
        System.out.println("Is Abundant Number? " + isAbundant(num));
        System.out.println("Is Deficient Number? " + isDeficient(num));
        System.out.println("Is Strong Number? " + isStrong(num));

        sc.close();
    }
}
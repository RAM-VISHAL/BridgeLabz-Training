import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive or negative
    public boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check whether the number is even or odd
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Loop to take input and check conditions
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (checker.isPositive(numbers[i])) {
                if (checker.isEven(numbers[i])) {
                    System.out.println("Number " + numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is Positive and Odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is Negative.");
            }
        }

        // Compare first and last element
        int result = checker.compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First number (" + numbers[0] + ") is greater than last number (" + numbers[numbers.length - 1] + ").");
        } else if (result == 0) {
            System.out.println("First number (" + numbers[0] + ") is equal to last number (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("First number (" + numbers[0] + ") is less than last number (" + numbers[numbers.length - 1] + ").");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Get input from user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = sc.nextInt();

        //  Check for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive base number and non-negative power.");
        } else {
            int result = 1; //  Initialize result

            // Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            //  Print result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

       
    }
}
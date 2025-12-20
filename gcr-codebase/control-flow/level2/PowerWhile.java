import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = sc.nextInt();

        //  Check for valid input
        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive base number and non-negative power.");
        } else {
            int result = 1;   //  Initialize result
            int counter = 0;  //  Initialize counter

            //  Run while loop till counter == power
            while (counter < power) {
                result = result * number; // multiply result by number
                counter++;                // increment counter
            }

            //  Print result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
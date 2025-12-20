import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Get input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        //  Check if input is valid
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int greatestFactor = 1; // initialize
            int counter = number - 1; // start from one less than the number

            //  Run while loop till counter >= 1
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter; // assign factor
                    break; // stop at the first (largest) factor found
                }
                counter--; // decrement counter
            }

            //  Display result
            System.out.println("Greatest factor of " + number + " (beside itself) is: " + greatestFactor);
        }

        sc.close();
    }
}
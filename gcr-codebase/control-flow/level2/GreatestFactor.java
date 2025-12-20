import java.util.Scanner;

public class GreatestFactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Get input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if input is valid
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int greatestFactor = 1; // initialize

            //  Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i; // assign factor
                    break; // stop at the first (largest) factor found
                }
            }

            //  Display result
            System.out.println("Greatest factor of " + number + " (beside itself) is: " + greatestFactor);
        }

        sc.close();
    }
}
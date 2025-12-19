import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // initialize total
        double number;        // variable to store user input

        System.out.println("Enter numbers to add (enter 0 to stop):");

        // first input
        number = sc.nextDouble();

        // loop until user enters 0
        while (number != 0) {
            total += number;  // add to total
            System.out.println("Current total: " + total);
            System.out.print("Enter another number (0 to stop): ");
            number = sc.nextDouble(); // ask again
        }

        // display final total
        System.out.println("Final total sum = " + total);

        sc.close();
    }
}
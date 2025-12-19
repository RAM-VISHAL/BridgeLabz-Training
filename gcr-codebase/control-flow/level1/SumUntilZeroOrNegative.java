import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // initialize total
        double number;        // variable to store user input

        System.out.println("Enter numbers to add (enter 0 or negative number to stop):");

        while (true) {   // infinite loop
            number = sc.nextDouble();  // take input

            // check for 0 or negative
            if (number <= 0) {
                break;  // exit loop
            }

            total += number;  // add to total
            System.out.println("Current total: " + total);
            System.out.print("Enter another number: ");
        }

        // display final total
        System.out.println("Final total sum = " + total);

       
}}
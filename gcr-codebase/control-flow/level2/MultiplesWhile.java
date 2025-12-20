import java.util.Scanner;

public class MultiplesWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Get input from user
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        //  Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            //  Initialize counter
            int counter = 100;

            //  Run while loop till counter > 1
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--; // decrement counter
            }
        }

        sc.close();
    }
}
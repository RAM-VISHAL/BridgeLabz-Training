import java.util.*;

public class HarshadNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //  Initialize variables
        int originalNumber = number;
        int sum = 0;

        //  Extract digits and calculate sum
        while (number != 0) {
            int digit = number % 10;   // get last digit
            sum = sum + digit;         // add digit to sum
            number = number / 10;      // remove last digit
        }

        //  Check divisibility
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        sc.close();
    }
}

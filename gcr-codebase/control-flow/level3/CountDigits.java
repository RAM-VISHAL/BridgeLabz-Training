import java.util.Scanner;

public class CountDigits{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //  Initialize count variable
        int count = 0;

        //  if number is 0
        if (number == 0) {
            count = 1;
        } else {
            //  Loop until number becomes 0
            while (number != 0) {

                //  Remove last digit
                number = number / 10;

                //  Increase count
                count++;
            }
        }

        //  Display the result
        System.out.println("Number of digits = " + count);

        sc.close();
    }
}

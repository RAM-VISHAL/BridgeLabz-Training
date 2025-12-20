import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Get input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        //  Check if input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Factors of " + number + " are:");
            
            //  Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                //  Check divisibility
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
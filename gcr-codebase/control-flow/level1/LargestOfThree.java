import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Initialize answers
        String first = "No";
        String second = "No";
        String third = "No";
        
         if (number1 >= number2 && number1 >= number3) {
            first = "Yes";
        } else if (number2 >= number1 && number2 >= number3) {
            second = "Yes";
        } else {
            third = "Yes";
        }

        // Output
        System.out.println("Is the first number the largest? " + first);
        System.out.println("Is the second number the largest? " + second);
        System.out.println("Is the third number the largest? " + third);

        sc.close();
    }
}
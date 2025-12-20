import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Get input from user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        //  Check if input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return; // exit program
        }

        //  Create arrays for odd and even numbers
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        //  Initialize index variables
        int oddIndex = 0;
        int evenIndex = 0;

        //  Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        //  Print odd numbers
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        //  Print even numbers
        System.out.println("\n\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
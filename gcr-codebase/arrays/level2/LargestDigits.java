import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //  Define array with maxDigit = 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        //  Index variable
        int index = 0;

        //  Extract digits and store in array
        while (number != 0) {
            int digit = number % 10;   // get last digit
            digits[index] = digit;     // store in array
            index++;                   // increment index
            number /= 10;              // remove last digit

            if (index == maxDigit) {   // stop if array full
                break;
            }
        }

        //  Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        //  Loop through array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // update second largest
                largest = digits[i];     // update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //  Display results
        System.out.println("\n--- Result ---");
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
import java.util.Scanner;

public class LargestDigitsDynamic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take user input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();  // use long for large numbers

        //  Define array with initial maxDigit = 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        //  Index variable
        int index = 0;

        //  Extract digits and store in array
        while (number != 0) {
            int digit = (int)(number % 10);   // get last digit
            number /= 10;                     // remove last digit

            // If array is full, expand by +10
            if (index == maxDigit) {
                maxDigit += 10;               // increase size
                int[] temp = new int[maxDigit]; // new bigger array
                // copy old digits into temp
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp; // assign temp back to digits
            }

            digits[index] = digit; // store digit
            index++;               // increment index
        }

        //  Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Loop through array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // update second largest
                largest = digits[i];     // update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //  Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
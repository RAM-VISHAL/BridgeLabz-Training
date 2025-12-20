import java.util.Scanner;

public class DigitFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step 2: Find count of digits
        long temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 4: Define frequency array of size 10
        int[] frequency = new int[10];

        // Step 5: Loop through digits array and increase frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Step 6: Display frequency of each digit
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
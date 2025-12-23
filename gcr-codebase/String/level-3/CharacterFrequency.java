import java.util.Scanner;

public class CharacterFrequency{

    // Method to find frequency of characters
    public static Object[][] findCharFrequency(String text) {
        // Frequency array for 256 ASCII characters
        int[] freq = new int[256];

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count how many unique characters exist
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Step 3: Create 2D array [uniqueCount][2]
        Object[][] result = new Object[uniqueCount][2];

        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = (char) i;   // store character
                result[index][1] = freq[i];    // store frequency
                index++;
            }
        }

        return result;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method
        Object[][] frequencies = findCharFrequency(input);

        // Display result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " -> " + frequencies[i][1]);
        }

        sc.close();
    }
}
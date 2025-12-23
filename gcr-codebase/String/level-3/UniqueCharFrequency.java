import java.util.Scanner;

public class UniqueCharFrequency{

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        String unique = "";

        // Nested loops to check uniqueness
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isDuplicate = false;

            // Check if character already exists in 'unique'
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to unique string
            if (!isDuplicate) {
                unique += ch;
            }
        }

        // Convert unique string to char array
        return unique.toCharArray();
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findCharFrequency(String text) {
        // Step 1: Frequency array for ASCII characters
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Step 3: Create 2D array [uniqueChars.length][2]
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // character
            result[i][1] = String.valueOf(freq[uniqueChars[i]]); // frequency
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
        String[][] frequencies = findCharFrequency(input);

        // Display result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " -> " + frequencies[i][1]);
        }

        sc.close();
    }
}
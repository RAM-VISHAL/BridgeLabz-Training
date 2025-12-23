import java.util.Scanner;

public class CharacterFrequency2{

    // Method to find frequency of characters
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();   // Convert string to char array
        int[] freq = new int[chars.length];  // Frequency array

        // Outer loop to pick each character
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;  // Initialize frequency to 1

            // Skip already counted characters
            if (chars[i] == '0') {
                continue;
            }

            // Inner loop to check duplicates
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate as '0'
                }
            }
        }

        // Create a 1D String array to store results
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Skip duplicates
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        // Trim unused positions
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method
        String[] frequencies = findFrequency(input);

        // Display result
        System.out.println("\nCharacter frequencies:");
        for (String s : frequencies) {
            System.out.println(s);
        }

        sc.close();
    }
}
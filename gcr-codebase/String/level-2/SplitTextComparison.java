import java.util.Scanner;

public class SplitTextComparison{

    //  Find length of String without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    //  Split text into words using charAt() (No split(), no length())
    public static String[] splitTextManually(String text) {

        int len = findLength(text);
        int wordCount = 1;

        // Count number of words
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = len;

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    //  Compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // User-defined split
        String[] manualSplit = splitTextManually(input);

        // Built-in split
        String[] builtInSplit = input.split(" ");

        // Display results
        System.out.println(" Words using manual split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println(" Words using built-in split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        // Compare results
        boolean result = compareStringArrays(manualSplit, builtInSplit);

        System.out.println(" Are both results same? " + result);

        sc.close();
    }
}

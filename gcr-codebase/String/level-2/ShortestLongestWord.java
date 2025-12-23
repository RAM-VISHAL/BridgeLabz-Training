import java.util.Scanner;

public class ShortestLongestWord {

    // Method 1: Find length of String without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method 2: Split text into words using charAt() (No split())
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

    // Method 3: Create 2D array with word and its length
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    // Method 4: Find shortest and longest word indexes
    public static int[] findShortestLongest(String[][] wordLengthArray) {

        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(wordLengthArray[0][1]);
        int maxLength = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);

            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }

            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Split text manually
        String[] words = splitTextManually(input);

        // Create 2D array of words and lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Find shortest and longest words
        int[] resultIndexes = findShortestLongest(wordLengthArray);

        int shortestIndex = resultIndexes[0];
        int longestIndex = resultIndexes[1];

        // Display results
        System.out.println("\nShortest Word: " + wordLengthArray[shortestIndex][0]
                + " (Length = " + wordLengthArray[shortestIndex][1] + ")");

        System.out.println("Longest Word: " + wordLengthArray[longestIndex][0]
                + " (Length = " + wordLengthArray[longestIndex][1] + ")");

        sc.close();
    }
}

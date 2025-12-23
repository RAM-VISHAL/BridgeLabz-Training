import java.util.Scanner;

public class TrimStringUsingCharAt {

    // Method 1: Find start and end index without leading/trailing spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method 2: Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method 3: Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // User-defined trimming
        int[] indexes = findTrimIndexes(input);
        String manualTrim = createSubstring(input, indexes[0], indexes[1]);

        // Built-in trim
        String builtInTrim = input.trim();

        // Compare both strings
        boolean result = compareStrings(manualTrim, builtInTrim);

        // Display result
        System.out.println("After trimming (Manual): [" + manualTrim + "]");
        System.out.println("After trimming (Built-in): [" + builtInTrim + "]");
        System.out.println("Are both strings equal? " + result);

        sc.close();
    }
}

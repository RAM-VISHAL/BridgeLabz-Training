public class CompareStrings{
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        // Compare character by character
        for (int i = 0; i < minLen; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 != c2) {
                return c1 - c2; // positive if str1 > str2, negative if str1 < str2
            }
        }

        // If all characters are same till minLen, compare lengths
        return len1 - len2;
    }

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";

        int result = compareStrings(s1, s2);

        if (result == 0) {
            System.out.println("Strings are equal");
        } else if (result < 0) {
            System.out.println(s1 + " comes before " + s2);
        } else {
            System.out.println(s1 + " comes after " + s2);
        }
    }
}
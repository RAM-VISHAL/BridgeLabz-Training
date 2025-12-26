public class SubstringOccurrences{
    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index = index + 1; // allow overlapping matches
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "abababa";
        String subStr = "aba";

        System.out.println("Occurrences: " + countOccurrences(str, subStr));
    }
}
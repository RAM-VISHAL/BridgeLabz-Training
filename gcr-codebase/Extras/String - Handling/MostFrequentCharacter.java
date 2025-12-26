public class MostFrequentCharacter {
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // frequency array for all ASCII characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find the character with maximum frequency
        int maxFreq = -1;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxFreq) {
                maxFreq = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "success";
        char mostFrequent = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
public class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Split sentence into words
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equals(oldWord)) {
                result.append(newWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        // Remove the last extra space
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "I love Java programming";
        String oldWord = "Java";
        String newWord = "Python";

        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated Sentence: " + updatedSentence);
    }
}
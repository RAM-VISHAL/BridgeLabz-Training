
import java.util.*;

public class NumberGuessingGame {

    // Function to generate a random guess within the current range
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Function to get user feedback
    public static String getUserFeedback(Scanner sc, int guess) {
        System.out.println("Is your number " + guess + "?");
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine().trim().toLowerCase();
    }

    // Function to update the range based on feedback
    public static int[] updateRange(int low, int high, int guess, String feedback) {
        if (feedback.equals("high")) {
            high = guess - 1;   // number is lower than guess
        } else if (feedback.equals("low")) {
            low = guess + 1;    // number is higher than guess
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(sc, guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number: " + guess);
                found = true;
            } else {
                int[] range = updateRange(low, high, guess, feedback);
                low = range[0];
                high = range[1];
            }
        }

        if (!found) {
            System.out.println("Hmm, something went wrong. Did you give consistent feedback?");
        }

        sc.close();
    }
}
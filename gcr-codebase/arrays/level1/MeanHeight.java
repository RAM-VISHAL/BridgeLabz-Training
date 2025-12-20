import java.util.*;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array of size 11
        double[] heights = new double[11];
        double sum = 0.0;

        // Step 2: Get input values from user
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }

        // Step 3: Find sum of all elements
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }

        // Step 4: Calculate mean
        double mean = sum / 11;

        // Step 5: Display result
        System.out.println("Mean height of the football team = " + mean);
    }
}
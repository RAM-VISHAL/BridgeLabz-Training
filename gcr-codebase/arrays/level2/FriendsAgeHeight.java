import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.println("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();

            // Validation
            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input! Please re-enter details.");
                i--; // repeat for same friend
            }
        }

        // Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output results
        System.out.println("\n--- Result ---");
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
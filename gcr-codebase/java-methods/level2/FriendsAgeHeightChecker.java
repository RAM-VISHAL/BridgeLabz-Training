import java.util.*;

public class FriendsAgeHeightChecker {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex] + " is the youngest with age " + ages[minAgeIndex];
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, int[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return names[maxHeightIndex] + " is the tallest with height " + heights[maxHeightIndex] + " cm";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input ages and heights
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextInt();
        }

        // Find and display youngest and tallest
     
        System.out.println(findYoungest(names, ages));
        System.out.println(findTallest(names, heights));

       
    }
}
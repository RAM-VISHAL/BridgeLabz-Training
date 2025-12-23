import java.util.Scanner;

public class VotingEligibility {

    // Method 1: Generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // Generate random 2-digit age (10 to 99)
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // Method 2: Check voting eligibility and return 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]); // Store age

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false"; // Negative age cannot vote
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }

        return result;
    }

    // Method 3: Display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("Age Can Vote");
       

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of students as input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] votingResult = checkVotingEligibility(ages);

        // Display result
        displayResult(votingResult);

        sc.close();
    }
}

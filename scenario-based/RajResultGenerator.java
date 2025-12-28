import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];   // Array for 5 subjects
        int sum = 0;

        System.out.println("=== Raj's Result Generator ===");

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        // Calculate average
        double average = sum / 5.0;
        System.out.println("\nAverage Marks: " + average);

        // Switch-case for grade assignment
        int gradeCategory = (int) average / 10;  // Divide by 10 to categorize

        switch (gradeCategory) {
            case 10: // 100
            case 9:  // 90-99
                System.out.println("Grade: A+");
                break;
            case 8:  // 80-89
                System.out.println("Grade: A");
                break;
            case 7:  // 70-79
                System.out.println("Grade: B");
                break;
            case 6:  // 60-69
                System.out.println("Grade: C");
                break;
            case 5:  // 50-59
                System.out.println("Grade: D");
                break;
            default: // Below 50
                System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
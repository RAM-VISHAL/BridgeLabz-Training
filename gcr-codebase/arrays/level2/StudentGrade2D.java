import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        //  Declare arrays
        int[][] marks = new int[n][3];         // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentage = new double[n];   // percentage array
        String[] grade = new String[n];        // grade array

        // Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = switch (j) {
                    case 0 -> "Physics";
                    case 1 -> "Chemistry";
                    case 2 -> "Maths";
                    default -> "Unknown";
                };

                System.out.print("Enter marks in " + subject + ": ");
                int m = sc.nextInt();

                if (m < 0) {
                    System.out.println("Invalid! Marks cannot be negative. Re-enter all marks for this student.");
                    i--; // repeat for same student
                    break;
                } else {
                    marks[i][j] = m;
                }
            }
        }

        //  Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Step 5: Assign grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        //  Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-6s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-6s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}
import java.util.Scanner;

public class StudentGrades{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Declare arrays
        int[][] marks = new int[n][3];         // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentage = new double[n];   // percentage array
        String[] grade = new String[n];        // grade array

        // Step 3: Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
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

        // Step 4: Calculate percentage and grade
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

        // Step 6: Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf( "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Remarks");

        for (int i = 0; i < n; i++) {
            String remarks = switch (grade[i]) {
                case "A" -> "Level 4, above standards";
                case "B" -> "Level 3, at standards";
                case "C" -> "Level 2, approaching standards";
                case "D" -> "Level 1, below standards";
                case "E" -> "Level 1-, too below standards";
                default -> "Remedial standards";
            };

            System.out.printf( marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i], remarks);
        }

        sc.close();
    }
}
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMMarks(int numStudents) {
        int[][] marks = new int[numStudents][3]; // [Physics, Chemistry, Math]

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = (int)(Math.random() * 50) + 50; // Physics: 50–99
            marks[i][1] = (int)(Math.random() * 50) + 50; // Chemistry: 50–99
            marks[i][2] = (int)(Math.random() * 50) + 50; // Math: 50–99
        }

        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateScores(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; // [Total, Average, Percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 digits
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
      

        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(marks[i][0] + "\t");
            System.out.print(marks[i][1] + "\t\t");
            System.out.print(marks[i][2] + "\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.println(results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] marks = generatePCMMarks(numStudents);
        double[][] results = calculateScores(marks);
        displayScorecard(marks, results);
    }
}
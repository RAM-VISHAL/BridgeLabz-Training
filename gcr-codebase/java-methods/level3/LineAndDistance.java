import java.util.Scanner;

public class LineAndDistance {

    // Method to calculate Euclidean distance
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate slope and intercept of line
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2 - x1);   // m = (y2 - y1)/(x2 - x1)
        double intercept = y1 - slope * x1;             // b = y1 - m*x1
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Calculate distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between points: " + distance);

        // Calculate line equation
        double[] line = lineEquation(x1, y1, x2, y2);
        double slope = line[0];
        double intercept = line[1];

        System.out.println("Equation of line: y = " + slope + "x + " + intercept);
    }
}
import java.util.Scanner;

public class CollinearityCheck {

    // Method to check collinearity using slope formula
    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample input: A(2,4), B(4,6), C(6,8)
        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        // Check using slope method
        boolean slopeResult = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Method: " + slopeResult);

        // Check using area method
        boolean areaResult = isCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Area Method: " + areaResult);

        // Final verdict
        if (slopeResult && areaResult) {
            System.out.println(" The points are collinear.");
        } else {
            System.out.println(" The points are not collinear.");
        }
    }
}
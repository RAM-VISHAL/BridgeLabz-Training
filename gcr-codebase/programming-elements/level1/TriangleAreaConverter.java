import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height in inches
        System.out.print("Enter base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = sc.nextDouble();

        // Formula: 1/2 * base * height
        double areaInSquareInches = 0.5 * base * height;

        // Conversion: 1 inch = 2.54 cm → 1 square inch = (2.54 * 2.54) cm²
        double areaInSquareCm = areaInSquareInches * 2.54 * 2.54;

        // Output
        System.out.println("Area of triangle in square inches: " + areaInSquareInches);
        System.out.println("Area of triangle in square centimeters: " + areaInSquareCm);

        sc.close();
    }
}

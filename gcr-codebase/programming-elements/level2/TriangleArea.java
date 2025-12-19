import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = sc.nextDouble();

        // Step 2: Calculate area in square centimeters
        double areaCm = 0.5 * base * height;

        // Step 3: Convert to square inches
        // 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) sq cm = 6.4516 sq cm
        double areaInch = areaCm / (2.54 * 2.54);

       
        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);

        sc.close();
    }
}

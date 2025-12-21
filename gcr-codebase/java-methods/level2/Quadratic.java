import java.util.Scanner;

public class Quadratic {

    // Method to find roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // Delta is negative, no real roots
            return new double[0];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 
        System.out.print("Enter  a: ");
        double a = sc.nextDouble();

        System.out.print("Enter  b: ");
        double b = sc.nextDouble();

        System.out.print("Enter  c: ");
        double c = sc.nextDouble();

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display results
        if (roots.length == 2) {
            System.out.printf("Two real roots:"+ roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("One real root: "+ roots[0]);
        } else {
            System.out.println("No real roots. Delta is negative.");
        }

        sc.close();
    }
}
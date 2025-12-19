import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

   
        double distanceInYards = distanceInFeet / 3.0;        // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760.0;    // 1 mile = 1760 yards


        System.out.println("Distance in feet: " + distanceInFeet);
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

        sc.close();
    }
}

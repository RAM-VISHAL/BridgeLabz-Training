// Bus Route Distance Tracker 
//Each stop adds distance.
//Ask if the passenger wants to get off at a stop.
//Use a while-loop with a total distance tracker.
//Exit on user confirmation.





import java.util.*;

public class BusRouteDistanceTracker{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int stopNumber = 1;
        String choice;

        while (true) {
            System.out.println("Stop " + stopNumber);
            System.out.print("Enter distance covered at this stop (in km): ");
            int distance = sc.nextInt();

            totalDistance += distance;

            System.out.print("Do you want to get off the bus? (yes/no): ");
            choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Passenger got off at stop " + stopNumber);
                break;
            }

            stopNumber++;
        }

        System.out.println("\n Journey Summary");
        System.out.println("Total Stops Travelled: " + stopNumber);
        System.out.println("Total Distance Covered: " + totalDistance + " km");

        sc.close();
    }
}

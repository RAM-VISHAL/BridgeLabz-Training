//Movie Ticket Booking App 
//Ask users for movie type, seat type (gold/silver), and snacks.
// Use switch and if together.
// Loop through multiple customers.
// Clean structure and helpful variable names.



import java.util.*;

public class TicketBookingApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of customers :");
        int totalCustomer = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 1; i <= totalCustomer; i++) {

            // movie selection
            System.out.println("Choose movie type :");
            System.out.println("1. Action");
            System.out.println("2. Drama");
            System.out.println("3. Comedy");
            int movieChoice = sc.nextInt();
            sc.nextLine(); // consume newline

            String movieType;
            switch (movieChoice) {
                case 1:
                    movieType = "Action";
                    break;
                case 2:
                    movieType = "Drama";
                    break;
                case 3:
                    movieType = "Comedy";
                    break;
                default:
                    movieType = "Unknown";
                    System.out.println("Invalid choice");
            }

            // seat selection
            System.out.println("Enter seat type (gold/silver): ");
            String seatType = sc.nextLine();

            // snacks
            System.out.println("Do you want snacks (yes/no): ");
            String snackType = sc.nextLine();

            String snackName = "None";
            int snackPrice = 0;

            if (snackType.equalsIgnoreCase("yes")) {
                System.out.println("Choose Snacks ");
                System.out.println("1. Chips (50)");
                System.out.println("2. Cold Drink (100)");
                System.out.println("3. Combo (150)");

                int snackOption = sc.nextInt();
                sc.nextLine(); // consume newline

                if (snackOption == 1) {
                    snackName = "Chips";
                    snackPrice = 50;
                } else if (snackOption == 2) {
                    snackName = "Cold Drink";
                    snackPrice = 100;
                } else if (snackOption == 3) {
                    snackName = "Combo";
                    snackPrice = 150;
                } else {
                    System.out.println("Invalid choice");
                }
            }

            // booking summary
            System.out.println("\n--- Booking Summary ---");
            System.out.println("Customer #" + i);
            System.out.println("Movie : " + movieType);
            System.out.println("Seat  : " + seatType);
            System.out.println("Snack : " + snackName + " (" + snackPrice + ")");
            System.out.println("-----------------------\n");
        }

        sc.close();
    }
}
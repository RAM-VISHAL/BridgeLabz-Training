import java.util.Scanner;

public class TrainReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeats = 5; // you can set any number of seats
        int choice;

        System.out.println(" Welcome to Train Reservation System ");

        // while loop for continuous booking until seats are finished
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (totalSeats > 0) {
                        System.out.println("Ticket booked successfully ");
                        totalSeats--; // reduce seat count
                        System.out.println("Remaining seats: " + totalSeats);
                        if (totalSeats == 0) {
                            System.out.println(" No seats left. Booking closed!");
                            break; // break out of switch
                        }
                    } else {
                        System.out.println(" Sorry, no seats available!");
                        break; // break out of switch
                    }
                    break;

                case 2:
                    System.out.println("Available seats: " + totalSeats);
                    break;

                case 3:
                    System.out.println("Thank you for using Train Reservation System ");
                    sc.close();
                    return; // exit program

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            // stop booking once seats reach zero
            if (totalSeats == 0) {
                System.out.println("System shutting down as all seats are booked.");
                break; // break out of while loop
            }
        }
    }
}
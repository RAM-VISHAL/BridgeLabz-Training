import java.util.Scanner;

public class DelhiMetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial balance
        double balance = 200.0;  // You can set any starting balance
        System.out.println("Welcome to Delhi Metro 🚇");
        System.out.println("Your starting Smart Card balance: ₹" + balance);

        while (balance > 0) {
            System.out.print("\nEnter distance travelled (in km) or -1 to quit: ");
            int distance = sc.nextInt();

            if (distance == -1) {
                System.out.println("You chose to quit. Final balance: ₹" + balance);
                break;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 2) ? 10 :
                          (distance <= 5) ? 20 :
                          (distance <= 10) ? 30 : 40;

            // Deduct fare
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance! Please recharge.");
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro Smart Card!");
        sc.close();
    }
}
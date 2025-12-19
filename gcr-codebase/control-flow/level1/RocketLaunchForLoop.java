import java.util.*;

public class RocketLaunchForLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // For loop countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("RocketLaunch");

        
    }
}

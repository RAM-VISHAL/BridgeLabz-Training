import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // While loop countdown

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Launch");

       
    }
}

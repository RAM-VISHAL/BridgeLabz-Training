import java.util.Scanner;

public class FriendsComparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Step 2: Take input for heights
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();

        // Step 3: Find youngest friend
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest friend is Amar");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }

        // Step 4: Find tallest friend
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest friend is Amar");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }

        sc.close();
    }
}


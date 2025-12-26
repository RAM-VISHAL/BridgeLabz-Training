import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take date input in format YYYY-MM-DD
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        // Perform operations
        LocalDate result = date.plusDays(7)
                               .plusMonths(1)
                               .plusYears(2)
                               .minusWeeks(3);

        // Display result
        System.out.println("Final Date after operations: " + result);
    }
}
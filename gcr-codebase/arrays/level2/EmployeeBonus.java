import java.util.Scanner;

public class EmployeeBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            // Validation: salary and years must be positive
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please re-enter details.");
                i--; // decrement index to re-enter for same employee
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output results
        System.out.println("\n--- Bonus Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " | Old Salary: " + salary[i] + " | Bonus: " + bonus[i] + " | New Salary: " + newSalary[i]);
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
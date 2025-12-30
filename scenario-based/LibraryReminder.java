import java.util.Scanner;

public class LibraryReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int finePerDay = 5; // ₹5 per day
        int books = 5;      // total books

        System.out.println(" Welcome to Rohan's Library Reminder App ");

        // loop for 5 books
        for (int i = 1; i <= books; i++) {
            System.out.println("\nBook " + i + ":");

            System.out.print("Enter Due Date (in days): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (in days): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                System.out.println("Returned late by " + lateDays + " days.");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time  No fine!");
            }
        }

        System.out.println("\nAll books processed. Thank you!");
        sc.close();
    }
}
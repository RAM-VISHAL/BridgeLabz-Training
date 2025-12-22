import java.util.Scanner;

public class CalendarGenerator {

    // Month names
    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Days in each month (non-leap year)
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Get name of the month
    public static String getMonthName(int month) {
        return monthNames[month];
    }

    // Zeller's Congruence to get first day of the month
    public static int getFirstDay(int day, int month, int year) {
        if (month < 2) {
            month += 12;
            year -= 1;
        }
        int y0 = year;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 1;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return d0; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Display calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDay(1, month, year);

        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop: indentation
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Second loop: print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (MM): ");
        int month = sc.nextInt() - 1; // Convert to 0-based index
        System.out.print("Enter year (YYYY): ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }
}
import java.util.*;

public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // [salary, yearsOfService]

        for (int i = 0; i < numEmployees; i++) {
            int salary = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            int years = (int)(Math.random() * 11); // 0 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] result = new double[numEmployees][2]; // [bonus, newSalary]

        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    // Method to display table and totals
    public static void displayTable(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-12s\n", "Emp", "Salary", "Years", "Bonus", "New Salary");
        

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            System.out.printf("%-5d %-10d %-10d %-10.2f %-12.2f\n", i + 1, salary, years, bonus, newSalary);

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

      
        System.out.printf(" total", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayTable(employeeData, bonusData);
    }
}
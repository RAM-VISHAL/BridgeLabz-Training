import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weight (in kilograms)
        System.out.print("Enter your weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Prompt user for height (in meters)
        System.out.print("Enter your height in meters: ");
        double heightInMeters = scanner.nextDouble();

        // Calculate BMI using formula: BMI = weight / (height * height)
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine BMI category using if-else conditions
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        // Close scanner to avoid resource leak
        scanner.close();
    }
}
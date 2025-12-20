import java.util.Scanner;

public class BMICalculator2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Step 2: Declare 2D array for height, weight, BMI
        double[][] personData = new double[number][3]; // [][0]=weight, [][1]=height, [][2]=BMI
        String[] weightStatus = new String[number];    // status array

        // Step 3: Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Weight input
            System.out.print("Enter weight (kg): ");
            double w = sc.nextDouble();
            while (w <= 0) {
                System.out.print("Invalid! Enter positive weight: ");
                w = sc.nextDouble();
            }

            // Height input
            System.out.print("Enter height (m): ");
            double h = sc.nextDouble();
            while (h <= 0) {
                System.out.print("Invalid! Enter positive height: ");
                h = sc.nextDouble();
            }

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h); // BMI calculation

            // Step 4: Determine weight status
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 5: Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf(" ", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf(" ",personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
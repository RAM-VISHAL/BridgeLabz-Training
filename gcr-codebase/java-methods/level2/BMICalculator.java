import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate the array
    public void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; // Convert cm to meters
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; // Store BMI in third column
        }
    }

    // Method to determine BMI status
    public String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMICalculator calculator = new BMICalculator();

        // 2D array: 10 rows (members), 3 columns (weight, height, BMI)
        double[][] data = new double[10][3];

        // Input weight and height
        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculator.calculateBMI(data);

        // Get BMI status
        String[] status = calculator.getBMIStatus(data);

        // Display results
        System.out.println("\nBMI Report:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf( (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }
}
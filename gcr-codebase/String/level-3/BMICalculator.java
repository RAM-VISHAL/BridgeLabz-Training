import java.util.Scanner;

public class BMICalculator{

    // Method 1: Calculate BMI and Status for one person
    public static String[][] calculateBMIAndStatus(double weight, double heightCm) {

        String[][] bmiData = new String[1][2];

        // Convert height from cm to meters
        double heightMeter = heightCm / 100.0;

        // BMI formula
        double bmi = weight / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        bmiData[0][0] = String.valueOf(bmi);
        bmiData[0][1] = status;

        return bmiData;
    }

    // Method 2: Process all persons and store height, weight, BMI, status
    public static String[][] processBMI(double[][] heightWeight) {

        String[][] result = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double height = heightWeight[i][1];

            String[][] bmiInfo = calculateBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiInfo[0][0];
            result[i][3] = bmiInfo[0][1];
        }
        return result;
    }

    // Method 3: Display result in tabular format
    public static void displayBMIReport(String[][] data) {

        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
       

        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" +
                    data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    data[i][2] + "\t" +
                    data[i][3]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] heightWeight = new double[10][2];

        // Taking user input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            heightWeight[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            heightWeight[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = processBMI(heightWeight);
        displayBMIReport(bmiReport);

        sc.close();
    }
}

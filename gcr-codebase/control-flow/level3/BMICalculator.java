import java.util.*;

public class BMICalculator{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        //  Calculate BMI
        double bmi = weight / (heightM * heightM);

        //  Determine BMI status
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        //  result
     
        System.out.println("BMI Value : " + bmi);
        System.out.println("Status    : " + status);

        sc.close();
    }
}

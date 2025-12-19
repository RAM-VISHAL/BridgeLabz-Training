import java.util.*;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        double totalInches = heightCm / cmPerInch;

        int feet = (int)(totalInches / inchesPerFoot);
        int inches = (int)Math.round(totalInches % inchesPerFoot);

        
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet +
                           " and inches is " + inches);

       }}
                             
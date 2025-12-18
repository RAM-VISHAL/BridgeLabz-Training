import java.util.*;

public class convertKiloToMiles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance :");
        double kilometer = sc.nextInt();

        double Miles = (kilometer * 0.621371);
       
        System.out.println("Convert Kilometer to miles :"+Miles);
     }}
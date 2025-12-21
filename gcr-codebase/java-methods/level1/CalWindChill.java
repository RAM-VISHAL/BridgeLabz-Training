import java.util.*;
public class CalWindChill{

      public static double calculateWindChill(double windSpeed , double temp){
      double  windChill = 35.74+0.6215*temp+(0.4275 * temp - 35.75) * Math.pow(windSpeed ,0.16);
     

      return windChill; 
     }

      public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      //taking input
      System.out.println("Enter  wind Speed :");
      double windSpeed = sc.nextDouble();
   
      System.out.println("Enter Temperature :");
      double temp = sc.nextDouble();
    
      System.out.println("The windChill "+calculateWindChill(windSpeed, temp));


}
}
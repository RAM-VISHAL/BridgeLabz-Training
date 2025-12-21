import java.util.*;
public class TrigonometricFunction{
     public static  double[] calculateTrigonametricFunctions(double angle){
      
      double radian = Math.toRadians(angle);
      
   
     // calculate sin cosine, tangent
      double sine = Math.sin(radian);
      double cosine = Math.cos(radian);
      double tangent = Math.tan(radian);
   
      return new double[]{sine,cosine,tangent};
      
      } 

     public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     // input
     System.out.println("Enter the angle :");
      
     double angle = sc.nextDouble();
     
     double result[] = calculateTrigonametricFunctions(angle);


     //Print results
     System.out.println("Sine :" +result[0] );
     System.out.println("Cosine :" +result[1] );
     System.out.println("Tangent :" +result[2] );
     
     
}
   }
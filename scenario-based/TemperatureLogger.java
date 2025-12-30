//Temperature Logger 
//Record temperatures over 7 days.
// Use array and for-loop.
// Find average and max temperature.
// Use if for comparisons. Maintain readable naming and modular code blocks.

import java.util.*;

public class TemperatureLogger{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      //create arr for store temperature
      double tempRecord[] = new double[7];
       
      // sum of all temperature records
      double totalTemp = 0;
    
      double maxTemp = tempRecord[0];
      
      System.out.println("Enter temperatures for 7 days:");

      for(int i=0; i<7; i++){
       System.out.println("Day"+ i + "Temperature :" );
       tempRecord[i] = sc.nextDouble();
        
       totalTemp = totalTemp+tempRecord[i];
        
        if(maxTemp < tempRecord[i]){
          maxTemp = tempRecord[i];
          }
      
       }
       
       
       double average = totalTemp/7;
       System.out.println("The average of Temperature : "+average);
       System.out.println("The max temperature is : "+maxTemp );
     }
   }
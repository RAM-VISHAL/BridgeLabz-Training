import java.util.*;
public class GateSystem{
   public static void main(String args[]){
       
   Scanner sc = new Scanner(System.in);
  
   int capacity = 10;   
   int occupancy = 0;
   int input ;
   
   while(capacity <= 10){
      
      System.out.println("Enter 1 for parking  : ");
      System.out.println("Enter 2 for exit the parking : ");
      System.out.println("Enter -1 for exit the program ");
      System.out.println();
      
      System.out.println("Enter your choice : ");

       
      input = sc.nextInt();
      if(input == -1){
        System.out.println("exit in the program successfully");
        return;
           }
      
      switch(input){
         
        case 1 : 
                 System.out.println("Car parked successfully");
                 capacity--;
                 occupancy++;
                 System.out.println("Show occupancy :"+occupancy);
                 break;
          
        case 2 : 
                 if(occupancy >= 1){
                 System.out.println("Car exit successfully");
                 capacity++;
                 occupancy--;
                    }
                 else{
                  System.out.println("Enter your car first ");
                    }
                
                 System.out.println("Show occupancy :"+occupancy);
                 break;
                 
       default:
                  System.out.println("Invalid choice! Try again.");
  
      
       }}
   
   
     } 
   }
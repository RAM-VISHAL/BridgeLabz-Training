import java.util.*;

public class AthleteRun{

    public static void CalAthlete(double side1,double side2,double side3){
     
    double parkPerimeter = side1+side2+side3;
    int distance = 5*1000; // 5km in meter 5000
    double rounds =  distance/parkPerimeter;
    
    System.out.println("The number of rounds user needs to do to complete 5km run "+ rounds);
    }

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter the side 1 of triangular park1  :");
     double side1 = sc.nextDouble();
    
     System.out.println("Enter the side 2 of triangular park1  :");
     double side2 = sc.nextDouble();

     System.out.println("Enter the side 3 of triangular park1  :");
     double side3 = sc.nextDouble();
      
     CalAthlete(side1,side2,side3);
    }  
}
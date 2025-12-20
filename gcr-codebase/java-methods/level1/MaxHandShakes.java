import java.util.*;
public class MaxHandShakes{
  
  public static void HandshakeCal(int numOfStud){

     //calculate handshakes 
     int totalHandshake = (numOfStud*(numOfStud-1))/2;
     System.out.println("Total number of hadshakes among all student are :      "+totalHandshake);
    }

  public static void main(String args[]){
    
    //taking input   
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter the number of student  :");
     int numOfStud = sc.nextInt();
     
     HandshakeCal(numOfStud);
     
}
}
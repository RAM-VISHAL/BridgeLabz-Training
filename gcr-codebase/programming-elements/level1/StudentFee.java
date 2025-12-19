import java.util.*;
public class StudentFee{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double fees = sc.nextDouble();
    double DiscPercent = sc.nextDouble();

    double DiscAmount = (fees * DiscPercent)/100;
    double DiscFees = fees - DiscAmount;
    
    System.out.println("The discount amount is INR "+ DiscAmount);
    System.out.println("The discount fees is INR "+ DiscFees);
}}

    
        
   
    
 
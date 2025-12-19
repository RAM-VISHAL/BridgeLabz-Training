import java.util.*;
public class FindQuotientReminder{
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter first Number ");
     int Num1 = sc.nextInt();
    
     
     System.out.println("Enter second  Number ");
     int Num2 = sc.nextInt();
    
     int Quotient = Num1/Num2;
     int Reminder = Num1%Num2;

     System.out.println("The Quotient is "+Quotient +"and Reminder is "+ Reminder + " of two number " + Num1 + " and "+ Num2);
}}

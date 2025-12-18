import java.util.*;
public class calSimpleInterest{
         public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter principle:");
         float principle = sc.nextFloat();
         
         System.out.println("enter rate:");
         float rate = sc.nextFloat();

         System.out.println("enter time:");
         float time = sc.nextFloat();
        
         float simpleInterest = (principle*rate*time)/100;
         System.out.println("Simple interest is :" + simpleInterest);
     }}
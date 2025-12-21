import java.util.*;
public class PrintNaturalNum{

   public static void SumOfNatural(int n){
       int totalSum = 0;
   for(int i=1; i<=n; i++){
       totalSum = totalSum+i;
      } 
   System.out.println("The total sum of "+totalSum);


  }
   
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      //taking input
      System.out.println("Enter Natural number :");
      int n = sc.nextInt();
      SumOfNatural(n);
     }
}
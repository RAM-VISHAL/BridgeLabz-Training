import java.util.*;

public class MultiplicationTable{
      public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number :");
       int num = sc.nextInt();
       
      //print multiplication table from 6 to 9
      
      System.out.println("Mulitiplication table of "+ num + " from 6 to 9:");
       for(int i=6; i<=9; i++){
         System.out.println(num + "*" + i + "=" +(num)*i);
     }
 
    }
}

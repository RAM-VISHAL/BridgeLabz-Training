//Festival Lucky Draw 
//At Diwali mela, each visitor draws a number.
//If the number is divisible by 3 and 5, they win a gift.
//Use if, modulus, and loop for multiple visitors.
//continue if input is invalid.

import java.util.*;
public class FestivalLuckyDraw{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
     //number of visitor 
     System.out.println("Enter total visitor :");
     int totalVisitor = sc.nextInt();
     

     for(int i=1; i<= totalVisitor; i++){
       System.out.println("Enter a lucky number :");
       int num = sc.nextInt();

       if(num <= 0){
           System.out.println("Invalid number! Enter a valid NUmber");
           continue;
             }
       else if(num % 5 == 0 && num % 3 == 0){
           System.out.println("Congratulations! You won a gift");
              }
       else{
           System.out.println("Better luck next time!");
            }
        
       }
     }
   }
import java.util.*;
public class NumberGuessingGame{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);         
      int secretNumber = (int)(Math.random() * 100) + 1;
        
      int attempt = 0;
      int maxAttempt = 5;
      int guess;
      
      do{
         System.out.println("Enter your guess number :");
         guess = sc.nextInt();
         attempt++;

         if(secretNumber > guess){
             System.out.println("Too high ");
               }
        else if(secretNumber < guess){
              System.out.println("Too low ");
               }
        else{
              System.out.println("Congratulations! You guessed the number in "+ attempt + " attempts");         
              break; 
               }
         }
       while(attempt < maxAttempt);
            {
            if(attempt == maxAttempt  && guess != secretNumber){
            
            System.out.println(" Game Over!");
            System.out.println("The correct number was: " + secretNumber);

               }
             }

    
      }
    }
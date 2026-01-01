// Online Quiz Application 
//Ask 5 questions (MCQs) from a user.
//Use arrays and for-loop.
//Record score.
// Switch for answer checking. Apply clear indentation and structured layout.

import java.util.*;

public class QuizApplication{
  public static void main(String args[]){
   
     Scanner sc = new Scanner(System.in);
    
     //store question 

      String question[] ={"Q1. Which language is used for Android development?",
                           "Q2. Which keyword is used to inherit a class in Java?",
                           "Q3. Which data structure uses FIFO principle?",
                           "Q4. Which of these is not OOP concept?",
                           "Q5. Which company developed Java?"
                           };

      String[][] options = {
            {"1. Java", "2. Python", "3. C#", "4. Kotlin"},
            {"1. super", "2. extends", "3. implements", "4. inherit"},
            {"1. Stack", "2. Queue", "3. Tree", "4. Graph"},
            {"1. Encapsulation", "2. Polymorphism", "3. Abstraction", "4. Compilation"},
            {"1. Microsoft", "2. Sun Microsystems", "3. Oracle", "4. IBM"}
                          };
        //Correct Answers Array (store option number)

        int[] answers = {4, 2, 2, 4, 2};

       //store score
        int score = 0;      

      for(int i=0; i<question.length; i++){
        System.out.println(question[i]);
          
           for(int j=0; j<options[i].length; j++){
            System.out.println(options[i][j]);
            }
         
         System.out.println("Enter Your Ans(1-4)");
         int userAns = sc.nextInt();
     
         switch(userAns){
          
             case 1:case 2: case 3: case 4: 
                if(answers[i] == userAns){
                   System.out.println("Right Answer");
                   score++;
                    }
                else{
                    System.out.println("wrong Answer , Right Answer is  +"+answers[i]);
                    }
                break;

            default :
                    System.out.println("Invalid choice, please enter (1-4)");
          }
         
          }
       //Final Score
       System.out.println("Your Score : "+ score);
      
     }
   }



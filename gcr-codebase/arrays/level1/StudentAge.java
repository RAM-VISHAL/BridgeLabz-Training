import java.util.*;

public class StudentAge{
    
      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          //array input        
          System.out.println("Enter array :");
          int age[] = new int[10];
   
         for(int i=0; i<10; i++){
              age[i] = sc.nextInt();
     
                }
      // check

        for(int i=0; i<10; i++){
        if(age[i]<0){
         System.out.println("invalid age");
         }
        else if(age[i]>=18){
         System.out.println("the Student age  "+age[i]+"  can vote");
           }
        else{
          System.out.println("the Student age  "+age[i]+"  can not vote");
          }
       }
     }}
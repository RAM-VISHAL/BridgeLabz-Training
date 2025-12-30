// Sandeep’s Fitness Challenge Tracker 
// Each day Sandeep completes a number of push-ups.
// Store counts for a week.
// Use for-each to calculate total and average.
// Use continue to skip rest days.


import java.util.*;
public class FitnessTracker{
  public static void main(String args[]){
   //pushup count for 7 days 
   int pushup[] = {40,0,30,40,10,60,20};
    
   //store total pusup
   int totalPushup = 0;
   
   // 
   int activeDay = 0;
   
  
   //use for calculate total pushup
     for(int a : pushup){
        if(a == 0){
          continue;
            }
        totalPushup = totalPushup + a;
        activeDay++;

       }
     //store average pushup
     double average = totalPushup/activeDay;
    
     System.out.println("Total push-ups: " + totalPushup);
     System.out.println("Average push-ups (active days): " + activeDay);      
   
     }
   }
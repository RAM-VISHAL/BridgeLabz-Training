//Digital Watch Simulation 
//Simulate a 24-hour watch:
//Print hours and minutes in a nested for-loop.
//Use a break to stop at 13:00 manually (simulate power cut).
//Core Java Scenario Based Problem Statements

import java.util.*;
public class DigitalWatchSimulation{
 public static void main(String args[]){

   for(int hour = 1; hour<24; hour++){
      
     for(int minute = 0; minute<60; minute++){
     
        System.out.println(hour +":"+  minute);
        if(hour == 13 && minute == 0){
             System.out.println("Power cut So watch is stop");
             return;
              }
        }
        
       }

   } 
 }
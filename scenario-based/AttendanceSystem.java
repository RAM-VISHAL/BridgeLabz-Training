//School Bus Attendance System 
//Track 10 students' presence.
// Use for-each loop on names.
//Ask "Present or Absent?"
// Print total present and absent counts.


import java.util.*;
public class AttendanceSystem{
   public static void main(String args[]){
         
     Scanner sc = new Scanner(System.in);
     char studentName[] = {'A','B','C','D', 'E', 'F', 'G' , 'H' , 'I','J'};
      
     int presentCount = 0;
     int absentCount = 0;
     
     //Ask student for attendance

     for(char student : studentName){
        System.out.println("Is  "+ student + "  present or absent ");
        String status = sc.nextLine();
        
        if(status.equals("present")){
            presentCount++;
            }
        else if(status.equals("absent")){
           absentCount++;
            }
        else{
            System.out.println("Invalid input! Counting as absent");
            absentCount++;
           
            }
        
         }
      System.out.println("---Attendance Result----");
      System.out.println("Total present in School bus :"+ presentCount);
      System.out.println("Total absent in School bus :"+ absentCount);
     
     }
   }
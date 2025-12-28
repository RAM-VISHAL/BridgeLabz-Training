import java.util.*;
public class PollingBooth{
    public static void main(String args[]){
     
    Scanner sc = new Scanner(System.in);
    int vote1 = 0;
    int vote2 = 0;
    int vote3 = 0;

    System.out.println("Enter Age :");
    
    
    while(true){
       System.out.println("Enter Age (or 0 to exit) :");
       int age = sc.nextInt();
    
       if(age == 0){
          break;
          }
        
        //check eligibility
   
        if(age < 18){
            System.out.println("Not eligible to vote.");
            continue;  //skip to next voter

             }
       //Record vote
       System.out.print("Enter your vote (1,2, or 3) :");
       int vote = sc.nextInt();
      
       if(vote == 1){
           vote1++;
           }
        else if(vote == 2){
           vote2++;
           }
        else if(vote == 3){
           vote3++;
           }
        else{
           System.out.println("Invalid vote!");
           }

        }
     
    System.out.println("Voting Result :");
    System.out.println("Candidate 1 "+ vote1 + "votes");
    System.out.println("Candidate 2 "+ vote2 + "votes");
    System.out.println("Candidate 3 "+ vote3 + "votes");


    
    }
  }
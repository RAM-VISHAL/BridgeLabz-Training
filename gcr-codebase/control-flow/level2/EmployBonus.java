import java.util.*;
public class EmployBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take integer input
        System.out.print("Enter a Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter yearService  : ");
        double yearService = sc.nextDouble();
 
       double bonusAmount = 0;
        if(yearService >5){
           bonusAmount = (5*salary)/100;
          }
          else{
          System.out.println("Sorry:")
            }
        System.out.println("Bonus Amount : "+bonusAmount);

}}
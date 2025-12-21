import java.util.*;
public class LeapYear{
     public static boolean isLeapYear(int year) {
        if(year < 1582){
            return false;
        }
        else{
            if((year % 4 ==0 && year % 100 != 0)||(year % 400 ==0)){
                return true;
            }
            else{
                return false;
            }
        }
     }

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if(isLeapYear(year)){
            System.out.println(year + "is leap year ");
        }else{
            System.out.println(year + "is not a leap year ");
        }

}}
import java.util.*;
import java.io.*;
class CompareString
{
    public static boolean checkString(String str1, String str2)
   {
      if(str1.length()!=str2.length()){
         return false;
         }
       for(int i=0; i<str1.length(); i++){
         if(str1.charAt(i)!=str2.charAt(i)){
           return false; 
           }
         }
        return true;
       
       }
     
       public static boolean checkString2(String str1, String str2){
        if(str1.equals(str2))	
	{
           return true;
        } 
          return false;
     }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first variable : ");
      String str1 = sc.next();
      System.out.println("Enter Second  variable : ");
      String str2 = sc.next();
      System.out.println("The String check in manuale : "+ checkString(str1,str2));
     
       System.out.println("The String check in-build method :  "+ checkString2(str1,str2)); 

      }
}
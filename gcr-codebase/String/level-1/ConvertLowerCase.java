import java.util.*;
public class ConvertLowerCase{

public static String upperToLower(String str){
     //with help of the ASCII value
    String ans = "";
    for(int i=0; i<str.length(); i++){
     char ch = str.charAt(i);

   // If character is lowercase (ASCII 97–122)
     if(ch >= 'A' && ch <= 'Z' ){
       ans = ans +(char) (ch+32);
       }
   // Keep as is (uppercase, digits, symbols, spaces)
      else{
        ans = ans + ch;
         }
     }
    return ans; 
   }
  public static boolean  compareString(String s1, String s2){
   
    if(s1.length() != s2.length()){
     return false;
     }  
     for(int i=0; i<s1.length(); i++){
      if(s1.charAt(i) != s2.charAt(i)) {
         return false;
        }   
      }
   
     return true;
   }
  
   public static void main(String args[]){
   //taking input 
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   
   //Build in method 
    String buildInResult = str.toLowerCase();
    
   // manual method
    String userBuildInResult = upperToLower(str);
    
    System.out.println("User Define LowerCase :"+userBuildInResult);
     System.out.println(" build-In LowerCase :"+buildInResult);

   //compare both method 
  boolean isEqual = compareString(buildInResult , userBuildInResult);
   
    //check both result are equal or not 
    if(isEqual){
      System.out.println("Both method are give equal result :");
      }
     else{
       System.out.println("Both method are give not equal result :");

        }
    }
}
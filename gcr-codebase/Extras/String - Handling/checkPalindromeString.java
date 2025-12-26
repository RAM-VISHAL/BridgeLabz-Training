import java.util.*;
public class checkPalindromeString{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String : ");
     String str = sc.nextLine(); 
     
    int start = 0;
    int end  = str.length()-1;
     boolean isPalindrome = true;

     while(start<end){
        if(str.charAt(start) != str.charAt(end)){
          isPalindrome = false;
          break;
       } 
       start++;
       end--;       
     }
    
     if (isPalindrome) {
            System.out.println("String is palindrome");
        }
      else {
            System.out.println("String is not palindrome");
           }
     
      }
     }
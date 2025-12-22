import java.util.*;
public class SubStringProg{
     
    // create substring manuale
  public static String createSubstring(String str1, int start, int end) {
        String sb = "";
    for (int i = start; i < end; i++) {
       sb = sb +str1.charAt(i);        
    }02
        return sb;
   }

     
    //compare two string 
    public static boolean compareTwoString(String s1, String s2){
     
      if(s1.length() != s2.length()){
         return false;
          }
      for(int i=0; i<s1.length(); i++){
         if(s1.charAt(i) != s2.charAt(i)){
           return false;
           }
        }
       return true;
      }
    

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      // taking input 
      System.out.println("Enter String  variable : ");
      String str1 = sc.nextLine();

      int start  = sc.nextInt();
      int end = sc.nextInt();
       
      //substring using manual
      String subCharAt = createSubstring(str1, start, end);
      
     // create substring in-build method
     String subInBuild = str1.substring(start,end);
   
     //compare both substring
      
     boolean result = compareTwoString(subCharAt, subInBuild);
     
     System.out.println("Substring using charAt() : "+subCharAt);
     System.out.println("Substring using Build-In method : "+ subInBuild);
     System.out.println("Are both substring equal :"+result);
     
     
 }
    }
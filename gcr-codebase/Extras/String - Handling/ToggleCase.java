import java.util.*;
public class ToggleCase{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter String ");
   
   String str = sc.nextLine();
   
   StringBuilder toggled = new StringBuilder();
   
   // traverse each character 
   for(int i=0; i<str.length(); i++){
     char ch = str.charAt(i);
     
    if(Character.isUpperCase(ch)){
       toggled.append(Character.toLowerCase(ch));  
       }
     else if(Character.isLowerCase(ch)){
       toggled.append(Character.toUpperCase(ch)); 
       }
      else{
        toggled.append(ch); // keeps digits/sysmbols ,
         }
      }  
     
      System.out.println("Toggled Case :"+toggled.toString());

    } 
  }
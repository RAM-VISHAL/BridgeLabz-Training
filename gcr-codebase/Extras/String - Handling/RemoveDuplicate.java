import java.util.*;
public class RemoveDuplicate{
     public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String : ");
     String str = sc.nextLine(); 
 
     String modifiedStr = "";
     HashSet<Character> hs = new HashSet<>();
     
      //add character to hashset
      for(char c :str.toCharArray()){
           hs.add(c);
           }   
       
       for(char c : hs){
       modifiedStr = modifiedStr + c;
       }
       System.out.println("Original String: " + str);
       System.out.println("Modified String: " + modifiedStr);


    }
}
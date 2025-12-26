import java.util.*;
public class LongestWord{

   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter sentence : ");
   
   String str = sc.nextLine();
   
   String words[] = str.split("\\s+");
   
   String longestWord = "";

   for(String word : words){
   if(word.length() > longestWord.length()){
   
       longestWord = word;
      }
   }
 
   System.out.println(""+longestWord);
 
     }
    }
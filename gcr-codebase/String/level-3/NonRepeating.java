import java.util.*;
public class NonRepeating{
    //frequency array for 256 ASCII character
  public static char findNonRepeatingChar(String str){
   
      int freq[] =  new int[256];
      for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i); 
        freq[ch]++;
        }
    
      // Step 2: Find first character with frequency = 1
      for(int i=0; i<str,length(); i++){
       char ch = str.charAt(i);
       if(freq[ch]  == 1){
         return ch;
          }
       }

      //if no non - repeating character found
      return '0';
      
      }
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Enter a String :");
      String str = sc.nextLine();
    
      char result = findNonRepeatingChar(str);
   
      if(result != '0'){
         System.out.println("First non repeating character :"+ result);
         }
       else{
         System.out.println("No non repeating character found ");

           }
      
      }
  

 }
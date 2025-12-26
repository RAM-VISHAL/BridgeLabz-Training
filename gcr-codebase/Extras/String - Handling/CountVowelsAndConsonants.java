import java.util.*;
public class CountVowelsAndConsonants{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String : ");
     String str = sc.nextLine();
     
      int vowelCount = 0;
      int consonantCount = 0;
      
     for(int i=0; i<str.length(); i++){
       char ch = str.charAt(i);
       if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'||
          ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U'){
            
            vowelCount++;
                }
        else{
              consonantCount++;
              }
        }
      
       System.out.println("Vowel count is : "+ vowelCOunt);
       System.out.println("consonant count is : "+ consonantCount);

        
     }
   }
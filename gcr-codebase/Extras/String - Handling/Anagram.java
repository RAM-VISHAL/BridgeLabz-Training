import java.util.*;

public class Anagram{

public static boolean checkAnagram(String str1, String str2){ 

str1 = str1.replaceAll("\\s","").toLowerCase();
str2 = str2.replaceAll("\\s","").toLowerCase();
   
if(str1.length() != str2.length()){
   return false;
    }
//convert all string to char Array

char arr1[] = str1.toCharArray();
char arr2[] = str2.toCharArray();

Arrays.sort(arr1);
Arrays.sort(arr2);

 return Arrays.equals(arr1,arr2);


  

}
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter first string :");
  String str1 = sc.nextLine();

  System.out.println("Enter second string :");
  String str2 = sc.nextLine();

  if(checkAnagram(str1,str2)){
      System.out.println("The String are anagram "); 
      }  
  else{
      System.out.println("the string are not anagram "); 
      }

   }
}
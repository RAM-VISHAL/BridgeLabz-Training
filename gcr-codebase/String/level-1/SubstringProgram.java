import java.util.*;
public class SubstringProgram{
    public static String createSubstring(String str, int startIndex, int endIndex){
         String subString = "";
         for(int i = startIndex; i < endIndex; i++){
            subString += str.charAt(i);
         }
         return subString;
    }

    // Creating CompareSubstring method to compare the result
    public static String CompareSubstring(String str, int startIndex, int endIndex){
         String sub = str.substring(startIndex, endIndex);
         return sub;
    }

    // Main method
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    
        // Taking input from user
        System.out.println("Enter string");
        String str = sc.nextLine();

        System.out.println("Enter starting Index");
        int startIndex = sc.nextInt();

        System.out.println("Enter end Index");
        int endIndex = sc.nextInt();

        System.out.println(createSubstring(str, startIndex, endIndex));
        System.out.println(CompareSubstring(str, startIndex, endIndex));

    }
}
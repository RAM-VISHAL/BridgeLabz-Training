import java.util.*;
public class StringIndexOutOfBoundsDemo{
     
     // Method to generate StringIndexOutOfBoundsException

      public static void generateException(String input){
        // Accessing index beyond the length of the string
     
      System.out.println("Character at index " + input.length() + ":" + input.charAt(input.length()));
       //This line will throw StringIndexOutOfBoundsException
       
      }
      // Method to handle StringIndexOutOfBoundsException using try-catch
      public static void handleException(String input){
         try{
            // Attempting to access index beyond the length
            System.out.println("Character at index " + input.length() + ": " + input.charAt(input.length()));

           }
         catch(StringIndexOutOfBoundsException e){
           // Handling the exception gracefully
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range!");

           }
       }
      
     
   
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
       
        System.out.println(" Generating Exception :");
     
        try{
           generateException(input);
           } catch(StringIndexOutOfBoundsException e){
        
            System.out.println("Exception occurred in generateException(): " +e);        
                 }
        
        System.out.println(" Handling Exception :");
        handleException(input);

}
   }
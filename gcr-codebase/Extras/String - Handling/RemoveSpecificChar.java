import java.util.*;
public class RemoveSpecificChar{
  public static void main(String args[]){
    String str = "Hello world";
    Removechar = 'l';
    
    //use replace() to remove all occurrences
    String  modifiedString = str.replace(String.valueOf(Removechar),"");
    System.out.println("MOdified String : "+modifiedString);
    }
  }
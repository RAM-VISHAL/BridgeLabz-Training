import java.util.*;
public class NumberOfChocolate{

      public static int[] DivideChocolate(int numberOfchocolates,int numberOfChildren){
       
      int divideEach = numberOfchocolates/ numberOfChildren;
      int remaining =  numberOfchocolates% numberOfChildren;
     
      return new int[]{divideEach,remaining};

      }
      public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      //taking input
      System.out.println("Enter  number  Of  chocolates :");
      int numberOfchocolates = sc.nextInt();
   
      System.out.println("Enter number Of Children :");
      int  numberOfChildren = sc.nextInt();
      
      int result[] = DivideChocolate(numberOfchocolates,numberOfChildren);
    
       System.out.println("number of chocolates each child get "+result[0]);
       System.out.println("number of chocolates remaining "+result[1]);
        
    
      
}

}
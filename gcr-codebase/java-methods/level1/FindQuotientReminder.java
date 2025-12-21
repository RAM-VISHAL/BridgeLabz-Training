import java.util.*;

public class FindQuotientReminder{
    public static int[] findRemainderAndQuotient(int num, int divisor){
   
    int quotient = num/divisor;
    int reminder  = num%divisor;
    
    return new int[]{quotient,reminder};

    
}
  
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      //taking input
      System.out.println("Enter  number :");
      int num = sc.nextInt();
   
      System.out.println("Enter divisor  number :");
      int divisor = sc.nextInt();
   
      int ans[] = findRemainderAndQuotient(num,divisor);

    
      System.out.println("quotient is "+ans[0]);
      System.out.println("remainder is "+ans[1]);
     
}
  }
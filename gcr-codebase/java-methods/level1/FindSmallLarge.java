import java.util.*;
public class FindSmallLarge{

   public static int[] findSmallestAndlargest(int num1,int num2, int num3){
     int smallest = num1;
     int largest = num1;
   //compare num2
   
   if(num2 < smallest){
      smallest = num2;
      }
   if(num2 > largest){
      largest = num2;
      }

    // compare num3 
   if(num3>largest){
      largest = num3;
      }
   if(num3 < smallest) {
      smallest = num3;
      }
   
  return new int[]{smallest , largest};
    
  
}
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      //taking input
      System.out.println("Enter first  number :");
      int num1 = sc.nextInt();
   
      System.out.println("Enter second  number :");
      int num2 = sc.nextInt();
  
      System.out.println("Enter third number :");
      int num3 = sc.nextInt();   
      
    //calling method 
      int ans[] = findSmallestAndlargest(num1,num2,num3);

    // Displaying results
        System.out.println("Smallest number: " + ans[0]);
        System.out.println("Largest number: " + ans[1]);

 

}
}
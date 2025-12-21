import java.util.*;
public class NaturalNumber{
   public static int findSumOfNaturalNumFarmula(int num){
    
    int sum = num*(num+1)/2;
    return sum;
   }
   
   public static int findRecursiveSum(int num){
      if(num == 1){
       return 1;
       }
      return num + findRecursiveSum(num-1);
    }
   
   public static void main(String args[]){
   
         //taking input 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter natural  number :");
        int num = sc.nextInt();

       if(num <= 0){
        System.out.println("Please enter a valid natural number (greater than 0)");
        return ;
         }

       //Display results
       System.out.println("Sum using recursion: " + findRecursiveSum(num));
       System.out.println("Sum using formula: " + findSumOfNaturalNumFarmula(num));

       if(findRecursiveSum(num) == findSumOfNaturalNumFarmula(num) ){
        System.out.println("Both computations are correct"); 
        }
       else{
        System.out.println("Both computations are not  correct"); 
         }


    }

}
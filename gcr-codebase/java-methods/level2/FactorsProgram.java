import java.util.*;
import javax.sound.midi.Soundbank;
public class FactorsProgram{
    public static int[] findFactors(int num){
        //count the factors of num
        int count = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                count++;
            }
        }
        //store the factor
        int factors[] = new int[count];
        int index = 0;

        //find factors of num and store in arr
          for(int i=1; i<num; i++){
            if(num % i == 0){
                factors[index] = i;
                index++;
            }
        }
        return factors;
 
    }
    //method to find the sum of factor 

    public static int sumOfFactor(int factors[]){
        int  sum = 0;
        for(int a : factors){ 
            sum = sum+a;
        }
        return sum;
    }
    // Method to find product of  factors
    public static long productOfFactors(int factors[]){
        long  product = 1;
        for(int f : factors){ 
           product = product*f;
        }
        return product;
    }
    // Method to find sum of squares of factors

    public static double sumOfSq(int factors[]){
       double sumSq = 0;
       for(double s :factors){ 
        sumSq = sumSq + Math.pow(s,2);
       }
       return sumSq;
    }

      public static void main(String[] args) {
        //taking input 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();
         
        int factor[] = findFactors(num);

        //display factors
        System.out.println("Factirs of " + num + "are :");
        for(int f : factor){  
            System.out.print(f + " ");
        }
        System.out.println();
         

        System.out.println("Sum of factors :"+sumOfFactor(factor) );
        System.out.println("Sum of Square :" + sumOfSq(factor));
        System.out.println("Product of factors :" + productOfFactors(factor));
     }
    }
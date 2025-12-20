import java.util.Scanner;

public class FindOddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take integer input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        //check natural number
       if(n<1){
        System.out.println("It is not a Natural Number");
        }
        else{
        
          if(n%2 == 0){
                 System.out.println(" Even Number :"+n);
               }
           else{
                System.out.println(" Odd Number :"+n);
              }
             }
        }
}

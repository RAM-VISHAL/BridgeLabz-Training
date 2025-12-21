import java.util.*;
public class CheckNumPNZ{
   public static int CheckNumber(int n ){
       if(n<0){
         return -1;
        }   
        else if(n>0){
        return 1;
         }
         else{
        return 0;
         }

}
 
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //taking inputa
        System.out.println("Enter number :");
        int n = sc.nextInt();
        
        System.out.println("The Number is : "+CheckNumber(n));

       }
 
}
import java.util.*;
public class SimpleInterest{

  public static void CalcuInterest(double principle,double rate , double time){
     
    double simpleInterest = (principle*rate*time)/100;
    
   System.out.println("The Simple Interest is "+ simpleInterest + " for Principal "+ principle + ", Rate of Interest "+ rate +" and Time " + time );

}
    public static void main(String args[]){
       
     Scanner sc = new Scanner(System.in);
     //input
    
     System.out.println("Enter the principle :");
     double principle = sc.nextDouble();
  
     System.out.println("Enter the rate :");
     double rate = sc.nextDouble();
     
     System.out.println("Enter the time :");
     double time = sc.nextDouble();
      
     CalcuInterest(principle,rate,time);
  
    
}     
    }
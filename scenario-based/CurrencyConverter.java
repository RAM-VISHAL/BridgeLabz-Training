//18. Currency Exchange Kiosk 
//Design a currency converter:
//Take INR amount and target currency.
//Use a switch to apply the correct rate.
//Ask if the user wants another conversion (do-while).

import java.util.*;

public class CurrencyConverter{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     char again;
     

     
     do{
        System.out.println("Enter a INR Rupee :");
        double INR = sc.nextDouble();
        System.out.println("1.INR to USD");
        System.out.println("2.INR to EURO");
        System.out.println("3.INR to British Pound");
        System.out.println("4.INR to Australian Doller");
        System.out.println("5.INR to Canadian Doller");
        System.out.println("6.Terminate the program");
 
        //double INR = sc.nextDouble();
        
        System.out.println("Enter conversion currency(1-5) ");
        int choice = sc.nextInt();
       
        double convertValue ;

        switch(choice){
             case 1 :
                     convertValue = (INR/89.85);
                     System.out.println("INR "+INR+ "to" + convertValue +" USD");

                     break;
             case 2 :
                     convertValue = (INR/105.36);
                     System.out.println("INR "+INR+ "to" + convertValue +" EURO");
                     break;
 
             case 3 :
                     convertValue = (INR / 120.695);
                     System.out.println("INR "+INR+ "to" + convertValue +" British Pound");

                     break;
             
             case 4 :
                     convertValue = (INR / 60.066);
                  System.out.println("INR "+INR+ "to" + convertValue +" Australian Doller");
                     break;
              
             case 5 : 
                     convertValue = (INR / 65.57);
                   System.out.println("INR "+INR+ "to" + convertValue +" Canadian Doller");

                     break;
             
            case 6 :
                    break;
            
             default :
                     System.out.println("Invalid statement ");
                      break;
 
                     
         }
    
         System.out.print("Do you want another conversion? (y/n): ");
         again = sc.next().charAt(0);
                 
         }while(again == 'y' || again == 'Y');
     
         System.out.println("Thank you for using Currency Exchange Kiosk!");

    } 
  }
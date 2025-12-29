//Shopkeeper’s Discount Dashboard 
//A shopkeeper gives discounts based on total bill:
// Input item prices in a for-loop.
// Use if-else for discount logic.
// Use proper indentation, constants, and comments.

import java.util.*;
public class ShopkeeperDiscount{
    public static void  main(String args[]){
     
     Scanner sc = new Scanner(System.in);
     double totalBill = 0.0;
     double price ;
     double discountPrice;
     System.out.println("Enter Item  ");
     int items = sc.nextInt();
    
    for(int i=0; i<=items; i++ ){
          
         System.out.println("Enter price of item ");
          price = sc.nextDouble();
         if(price > 0){
           totalBill = totalBill+price;
              }
         System.out.println("Total Bill  "+ totalBill);
         
       if(price == -1){
            System.out.println("Your total bill is :"+totalBill);
            break;
            }
       else if(price >= 50000){
            System.out.println("You are eligible for 15% discount :");
            discountPrice = totalBill - (totalBill*15)/100;
            System.out.println("Discount price :"+discountPrice);
             }
       else if(price >= 10000){
             System.out.println("You are eligible for 10% discount : ");
             discountPrice = totalBill - (totalBill * 10)/100;
             System.out.println("Discount price :"+discountPrice);
             }
       else{
           System.out.println("You are not eligible for discount :"+ totalBill);
            }

          }
       }
     }
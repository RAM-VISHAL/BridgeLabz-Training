public class UniversityDiscount{
        public static void main(String args[]){
           int fees = 125000;
           int discPercentage = 10;
           
           int discAmount = (fees*discPercentage)/100;
           int discfees = fees - discAmount;
           
           System.out.println("The discount amount is INR "+ discAmount + " and final discounted fee is INR "+ discfees); 
}}
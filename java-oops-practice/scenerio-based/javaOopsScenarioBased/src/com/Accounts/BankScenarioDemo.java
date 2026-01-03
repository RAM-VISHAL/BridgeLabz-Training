package com.Accounts;

//Main class
public class BankScenarioDemo {
 public static void main(String[] args) {

     SavingsAccount savings = new SavingsAccount(5000, 5.0);

     Customer customer1 = new Customer("Ram", savings);

     customer1.performTransactions();

     savings.addInterest();
     savings.showBalance();
 }
}

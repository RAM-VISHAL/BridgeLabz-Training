package com.Accounts;

//Child class (Inheritance)
class SavingsAccount extends Account {
 private double interestRate;

 SavingsAccount(double balance, double interestRate) {
     super(balance);
     this.interestRate = interestRate;
 }

 void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest Added: " + interest);
 }
}

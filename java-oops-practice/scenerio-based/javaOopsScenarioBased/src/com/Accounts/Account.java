package com.Accounts;

//Parent class
class Account {
 protected double balance;

 // Constructor
 Account(double balance) {
     this.balance = balance;
 }

 // Deposit method
 void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount);
 }

 // Withdraw method
 void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient Balance!");
     }
 }

 void showBalance() {
     System.out.println("Current Balance: " + balance);
 }
}

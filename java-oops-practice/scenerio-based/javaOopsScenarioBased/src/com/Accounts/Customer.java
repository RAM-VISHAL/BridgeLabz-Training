package com.Accounts;

//Customer class (HAS-A relationship)
class Customer {
 private String name;
 private Account account;

 Customer(String name, Account account) {
     this.name = name;
     this.account = account;
 }

 void performTransactions() {
     System.out.println("\nCustomer: " + name);
     account.deposit(2000);
     account.withdraw(1000);
     account.showBalance();
 }
}

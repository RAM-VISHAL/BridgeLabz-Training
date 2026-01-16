package com.SmartCheckout;
import java.util.Arrays;

public class SmartCheckoutApp {

    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        checkout.addItem("Milk", 50, 5);
        checkout.addItem("Bread", 40, 3);
        checkout.addItem("Eggs", 6, 20);

        Customer c1 = new Customer("Alice", Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Bob", Arrays.asList("Eggs", "Milk"));

        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        checkout.processCustomer();
        checkout.processCustomer();
        checkout.processCustomer();
    }
}

package com.swiftcart;

public class SwiftCartApp {

    public static void main(String[] args) {

        Product p1 = new PerishableProduct("Milk", 50);
        Product p2 = new NonPerishableProduct("Rice", 120);
        Product p3 = new PerishableProduct("Vegetables", 80);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.applyDiscount(20); // coupon value
        cart.generateBill();
    }
}
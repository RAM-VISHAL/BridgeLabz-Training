package com.swiftcart;


import java.util.ArrayList;

class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice; // protected from outside access

    // Constructor without items
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice(); // operator +
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    @Override
    public void applyDiscount(double coupon) {
        double discount = 0;

        for (Product p : products) {
            discount += p.applyDiscount(totalPrice); // polymorphism
        }

        totalPrice = totalPrice - discount - coupon; // operator -
    }

    @Override
    public void generateBill() {
        System.out.println("\n🧾 SwiftCart Bill");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("Total Amount: ₹" + totalPrice);
    }
}
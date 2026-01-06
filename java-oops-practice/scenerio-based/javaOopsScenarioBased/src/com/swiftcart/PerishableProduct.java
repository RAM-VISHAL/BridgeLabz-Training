package com.swiftcart;

class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.10; // 10% discount
    }
}
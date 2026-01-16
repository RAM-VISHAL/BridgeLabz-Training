package com.SmartCheckout;

public class Item {
    private double price;
    private int stock;

    public Item(double price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock() {
        stock--;
    }
}

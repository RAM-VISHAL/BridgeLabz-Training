package com.GameBox;

public abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Operator usage – apply seasonal discount
    public void applyDiscount(double discountPercent) {
        price -= price * (discountPercent / 100);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

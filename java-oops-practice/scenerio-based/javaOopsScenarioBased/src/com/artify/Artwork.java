package com.artify;

public class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    // Encapsulated licensing terms
    protected String licensingTerms;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.licensingTerms = "Standard license";
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price, String licenseType, String licensingTerms) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.licensingTerms = licensingTerms;
    }

    protected String getLicensingTerms() {
        return licensingTerms;
    }

    // Operator usage – wallet balance deduction
    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductAmount(price);
            System.out.println(user.getName() + " purchased " + title);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void license(User user) {
        System.out.println("Licensing artwork: " + title);
    }
}


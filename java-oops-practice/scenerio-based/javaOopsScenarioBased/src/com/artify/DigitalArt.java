package com.artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        this.licensingTerms = "Digital License: Non-transferable";
    }

    @Override
    public void license(User user) {
        System.out.println(user.getName() + " received digital license for " + title);
        System.out.println("Terms: " + getLicensingTerms());
    }
}


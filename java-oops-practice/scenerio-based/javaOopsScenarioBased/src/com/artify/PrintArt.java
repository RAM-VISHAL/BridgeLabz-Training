package com.artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        this.licensingTerms = "Print License: Limited copies allowed";
    }

    @Override
    public void license(User user) {
        System.out.println(user.getName() + " received print license for " + title);
        System.out.println("Terms: " + getLicensingTerms());
    }
}

package com.artify;

public class ArtifyApp {
    public static void main(String[] args) {

        User user1 = new User("Vishal", 5000);

        Artwork art1 = new DigitalArt("Galaxy NFT", "Alex", 2000, "Digital");
        Artwork art2 = new PrintArt("Nature Poster", "Mia", 1500, "Print");

        art1.purchase(user1);
        art1.license(user1);

        art2.purchase(user1);
        art2.license(user1);

        System.out.println("Remaining Balance: " + user1.getWalletBalance());
    }
}

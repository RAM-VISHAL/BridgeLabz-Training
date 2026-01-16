package com.GameBox;

public class GameBoxApp {

    public static void main(String[] args) {

        Game g1 = new ArcadeGame("Speed Racer", 299, 4.5);
        Game g2 = new StrategyGame("Empire Builder", 499, 4.8);

        // Seasonal offer
        g2.applyDiscount(20);

        User user = new User("PlayerOne");

        g1.download();
        g1.playDemo();   // polymorphism

        g2.download();
        g2.playDemo();   // polymorphism

        user.purchaseGame(g1);
        user.purchaseGame(g2);

        System.out.println("\nOwned Games:");
        for (Game g : user.getOwnedGames()) {
            System.out.println(g.getTitle() + " - ₹" + g.getPrice());
        }
    }
}

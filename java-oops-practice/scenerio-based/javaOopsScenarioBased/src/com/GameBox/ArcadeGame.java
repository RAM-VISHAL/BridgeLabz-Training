package com.GameBox;

public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void download() {
        System.out.println("Downloading fast-paced arcade game: " + title);
    }

    @Override
    public void playDemo() {
        System.out.println("Playing arcade demo with time-based challenges");
    }
}

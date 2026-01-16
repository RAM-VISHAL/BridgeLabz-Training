package com.GameBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled access to owned games
    public void purchaseGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased " + game.getTitle());
    }

    // Encapsulation: no direct list access
    public List<Game> getOwnedGames() {
        return Collections.unmodifiableList(ownedGames);
    }
}

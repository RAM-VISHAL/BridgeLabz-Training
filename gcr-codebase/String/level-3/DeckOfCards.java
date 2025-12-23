import java.util.Scanner;

public class DeckOfCards{

    // Suits and Ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    // Method 1: Initialize the deck
    public static String[] initializeDeck() {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    // Method 2: Shuffle the deck
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method 3: Distribute cards to players
    public static String[][] distributeCards(String[] deck, int nCards, int players) {

        if (nCards % players != 0) {
            System.out.println("Cards cannot be distributed evenly among players.");
            return null;
        }

        int cardsPerPlayer = nCards / players;
        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playerCards;
    }

    // Method 4: Print players and their cards
    public static void printPlayers(String[][] playersCards) {

        if (playersCards == null) {
            return;
        }

        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.println("  " + playersCards[i][j]);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards to distribute: ");
        int nCards = sc.nextInt();

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        deck = shuffleDeck(deck);

        // Distribute cards
        String[][] playersCards = distributeCards(deck, nCards, players);

        // Print result
        printPlayers(playersCards);

        sc.close();
    }
}

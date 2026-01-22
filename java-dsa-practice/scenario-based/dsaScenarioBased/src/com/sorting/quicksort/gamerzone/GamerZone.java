package com.sorting.quicksort.gamerzone;

public class GamerZone {

    public static void quickSort(Player[] players, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(Player[] players, int low, int high) {

        int pivot = players[high].score;
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // descending order (high score first)
            if (players[j].score > pivot) {
                i++;
                Player temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }

        Player temp = players[i + 1];
        players[i + 1] = players[high];
        players[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("Alex", 1200),
            new Player("Ravi", 2500),
            new Player("Neha", 1800),
            new Player("John", 3000),
            new Player("Aman", 900)
        };

        quickSort(players, 0, players.length - 1);

        for (Player p : players) {
            System.out.println(p.name + " - " + p.score);
        }
    }
}

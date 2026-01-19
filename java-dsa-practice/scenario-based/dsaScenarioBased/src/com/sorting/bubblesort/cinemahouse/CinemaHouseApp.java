package com.sorting.bubblesort.cinemahouse;

public class CinemaHouseApp {

    public static void main(String[] args) {

        Movie[] shows = {
                new Movie("Avengers", 1830),
                new Movie("Inception", 1430),
                new Movie("Titanic", 2100),
                new Movie("Jumanji", 1600),
                new Movie("Interstellar", 1930)
        };

        CinemaHouse.bubbleSort(shows);

        System.out.println("🎬 Today's Movie Schedule:");

        for (Movie m : shows) {
            System.out.println(m.getShowTime() + " → " + m.getName());
        }
    }
}

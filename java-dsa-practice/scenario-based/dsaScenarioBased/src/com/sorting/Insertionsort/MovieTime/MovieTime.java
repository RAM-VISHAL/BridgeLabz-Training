package com.sorting.Insertionsort.MovieTime;

public class MovieTime {

    public static void insertionSort(Show[] shows) {

        for (int i = 1; i < shows.length; i++) {
            Show key = shows[i];
            int j = i - 1;

            while (j >= 0 && shows[j].time > key.time) {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Show[] shows = {
            new Show("Avatar", 1080),   // 6:00 PM
            new Show("Jawan", 900),     // 3:00 PM
            new Show("KGF", 780),       // 1:00 PM
            new Show("Pushpa", 1140)    // 7:00 PM
        };

        insertionSort(shows);

        for (Show s : shows) {
            System.out.println(s.movieName + " - " + s.time);
        }
    }
}

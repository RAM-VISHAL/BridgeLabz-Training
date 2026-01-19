package com.sorting.bubblesort.cinemahouse;

class CinemaHouse {

    public static void bubbleSort(Movie[] movies) {

        int n = movies.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (movies[j].getShowTime() > movies[j + 1].getShowTime()) {

                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization for small / nearly sorted data
            if (!swapped)
                break;
        }
    }
}

package com.sorting.Insertionsort.artexpo;

class ArtExpoManager {

    public static void insertionSort(Artist[] artists) {

        for (int i = 1; i < artists.length; i++) {

            Artist key = artists[i];
            int j = i - 1;

            // Shift later registrations to the right
            while (j >= 0 &&
                   artists[j].getRegistrationTime() > key.getRegistrationTime()) {

                artists[j + 1] = artists[j];
                j--;
            }

            artists[j + 1] = key;
        }
    }
}

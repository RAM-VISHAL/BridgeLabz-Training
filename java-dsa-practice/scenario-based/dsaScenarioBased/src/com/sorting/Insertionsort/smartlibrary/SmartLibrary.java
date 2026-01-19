package com.sorting.Insertionsort.smartlibrary;

class SmartLibrary {

    public static void insertionSort(Book[] books) {

        for (int i = 1; i < books.length; i++) {

            Book key = books[i];
            int j = i - 1;

            // Shift books that come after alphabetically
            while (j >= 0 &&
                   books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {

                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }
}

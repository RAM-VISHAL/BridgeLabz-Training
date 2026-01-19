package com.sorting.Insertionsort.smartlibrary;

public class SmartLibraryApp {

    public static void main(String[] args) {

        Book[] borrowedBooks = {
                new Book("Operating Systems"),
                new Book("Java Programming"),
                new Book("Data Structures"),
                new Book("Computer Networks"),
                new Book("Algorithms")
        };

        SmartLibrary.insertionSort(borrowedBooks);

        System.out.println("📚 Borrowed Books (Alphabetical Order):");

        for (Book b : borrowedBooks) {
            System.out.println(b.getTitle());
        }
    }
}

package com.smartshelf;

public class SmartShelfApp {

    public static void main(String[] args) {

        Book[] shelf = {
                new Book("Java Programming"),
                new Book("Algorithms"),
                new Book("Data Structures"),
                new Book("Computer Networks"),
                new Book("Artificial Intelligence")
        };

        SmartShelf.insertionSort(shelf);

        System.out.println("📚 Sorted Reading List:");
        for (Book b : shelf) {
            System.out.println(b.getTitle());
        }
    }
}

package com.BookShelf;

import java.util.*;

public class Library {

    private HashMap<String, LinkedList<Book>> genreMap = new HashMap<>();
    private HashSet<Book> bookSet = new HashSet<>();

    // Add Book
    public void addBook(Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Duplicate book not allowed: " + book.getTitle());
            return;
        }

        bookSet.add(book);
        genreMap.putIfAbsent(book.getGenre(), new LinkedList<>());
        genreMap.get(book.getGenre()).add(book);

        System.out.println("Book added: " + book);
    }

    // Borrow Book
    public void borrowBook(Book book) {
        if (!bookSet.contains(book)) {
            System.out.println("Book not found!");
            return;
        }

        LinkedList<Book> list = genreMap.get(book.getGenre());
        list.remove(book);
        bookSet.remove(book);

        System.out.println("Book borrowed: " + book);
    }

    // Return Book
    public void returnBook(Book book) {
        addBook(book);
        System.out.println("Book returned: " + book);
    }

    // Display all books
    public void displayLibrary() {
        System.out.println("\n📚 Library Catalog:");
        for (String genre : genreMap.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : genreMap.get(genre)) {
                System.out.println(" - " + book);
            }
        }
    }
}

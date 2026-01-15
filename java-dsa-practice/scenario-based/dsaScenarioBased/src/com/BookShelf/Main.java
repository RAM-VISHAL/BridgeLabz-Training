package com.BookShelf;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "Technology", "101");
        Book b2 = new Book("Data Structures", "Mark Allen", "Technology", "102");
        Book b3 = new Book("Harry Potter", "J.K. Rowling", "Fiction", "103");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.displayLibrary();

        System.out.println("\n--- Borrowing a Book ---");
        library.borrowBook(b2);

        library.displayLibrary();

        System.out.println("\n--- Returning a Book ---");
        library.returnBook(b2);

        library.displayLibrary();
    }
}

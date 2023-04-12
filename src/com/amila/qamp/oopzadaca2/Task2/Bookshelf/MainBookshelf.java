package com.amila.qamp.oopzadaca2.Task2.Bookshelf;

public class MainBookshelf {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(); // create a bookshelf

        Book book1 = new Book("Antigona", 12345699, "Sophocles"); // create books
        Book book2 = new Book("Iliad and Odyssey", 78912399, "Homer");
        Book book3 = new Book("Romeo and Juliet", 54321999, "William Shakespeare");

        bookshelf.addBook(book1); // add books to bookshelf
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        System.out.println("Books on the bookshelf are: "); //list of books on bookshelf
        bookshelf.printBookshelf();


        if (bookshelf.containsBook(book2.getTitle())) {
            System.out.println("The bookshelf contains a book with the " + book2.getTitle() + " title.");
        } else {
            System.out.println("The bookshelf does not contain a book with the " + book2.getTitle() + " title.");
        }

        if (bookshelf.containsBook("Lost treasure")) {
            System.out.println("The bookshelf contains a book with the" + "Lost treasure" + " title.");
        } else {
            System.out.println("The bookshelf does not contain a book with the " + "Lost treasure" + " title.");
        }

        if (bookshelf.containsBook(book1.getISBN())) {
            System.out.println("The bookshelf contains a book with " + book1.getISBN() + " ISBN.");
        } else {
            System.out.println("The bookshelf does not contain a book with " + book1.getISBN() + " ISBN.");
        }

        if (bookshelf.containsBook(99876543)) {
            System.out.println("The bookshelf contains a book with " + 99876543 + " ISBN.");
        } else {
            System.out.println("The bookshelf does not contain a book with " + 99876543 + " ISBN.");
        }
    }
}




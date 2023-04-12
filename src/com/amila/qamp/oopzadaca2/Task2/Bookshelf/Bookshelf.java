package com.amila.qamp.oopzadaca2.Task2.Bookshelf;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private List<Book> books;

    public Bookshelf() { //empty BookShelf
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean containsBook(String title) { // method 1 - title
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(long ISBN) { // method 2 ISBN
        for (Book book : books) {
            if (book.getISBN() == (ISBN)) {
                return true;
            }
        }
        return false;
    }

    public void printBookshelf() { // method 3 - print all books
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}




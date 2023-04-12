package com.amila.qamp.oopzadaca2.Task2.Bookshelf;

public class Book {
    private String title;
    private long ISBN;
    private String author;

    public Book(String title, long ISBN, String author) {
        this.author = author;
        this.ISBN = ISBN;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }


    public long getISBN() {
        return this.ISBN = ISBN;
    }

    public String toString() {
        return title + ", " + author + " (" + ISBN + ") ";
    }
}

package com.mycompany.librarymanagementsystem;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public boolean isIsAvailable() { return isAvailable; }
    public void setIsAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            throw new IllegalStateException("This book is not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
        } else {
            throw new IllegalStateException("This book was not borrowed.");
        }
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + "', author='" + author + "', isbn='" + isbn + "', isAvailable=" + isAvailable + '}';
    }
}

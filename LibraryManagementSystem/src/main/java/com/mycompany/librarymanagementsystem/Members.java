package com.mycompany.librarymanagementsystem;

public class Members extends User {
    public Members(String name, String userID) {
        super(name, userID);
    }

    public void borrowBook(Library library, Book book) {
        if (book.isIsAvailable()) {
            book.borrow();
        } else {
            throw new IllegalStateException("This book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (!book.isIsAvailable()) {
            book.returnBook();
        } else {
            throw new IllegalStateException("This book was not borrowed.");
        }
    }
}

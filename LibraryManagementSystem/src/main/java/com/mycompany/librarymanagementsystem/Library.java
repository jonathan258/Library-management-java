package com.mycompany.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books; // List of books
    private List<User> users;
    private List<Transaction> transactions;

    public Library() {
        books = new ArrayList<>(); // Initialize the books list
        users = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    // Method to add a book
    void addBook(Book book) {
        books.add(book);
    }

    // Method to register a user
    public void registerUser(User user) {
        users.add(user);
    }

    // Method to borrow a book
    public void borrowBook(User user, Book book) {
        if (book.isIsAvailable()) {
            book.borrow();
            transactions.add(new Transaction(book, user, "borrow"));
        } else {
            throw new IllegalStateException("This book is not available for borrowing.");
        }
    }

    // Method to return a book
    public void returnBook(User user, Book book) {
        book.returnBook();
        transactions.add(new Transaction(book, user, "return"));
    }

    // Getter for the list of books
    public List<Book> getBooks() {
        return books; // Return the list of books
    }

    // Other methods to find books and users
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null; // Or throw an exception
    }

    public User findUserById(String userId) {
        for (User user : users) {
            if (user.getUserID().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}

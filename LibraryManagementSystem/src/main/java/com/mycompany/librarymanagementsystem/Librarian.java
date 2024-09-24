package com.mycompany.librarymanagementsystem;

public class Librarian extends User {
    public Librarian(String name, String userId) {
        super(name, userId);
    }

    public void addBook(Library library, Book book) {
        if (library.findBookByIsbn(book.getIsbn()) == null) {
            library.addBook(book);
        } else {
            throw new IllegalArgumentException("This book already exists in the library.");
        }
    }
}

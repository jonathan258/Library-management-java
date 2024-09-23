package com.mycompany.librarymanagementsystem;

/**
 *
 * @author Jonathan 
 */

public class Librarian extends User {
    public Librarian(String name, String userId) {
        super(name, userId); // Call the constructor of User
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
    }

}
 


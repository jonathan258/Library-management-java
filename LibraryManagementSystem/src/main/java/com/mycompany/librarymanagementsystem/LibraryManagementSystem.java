package com.mycompany.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", "1234567890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
        library.registerUser(new Members("Alice", "user001")); // Assuming Member is renamed
        library.registerUser(new Librarian("Bob", "librarian001"));

        LibraryUI libraryUI = new LibraryUI(library);
        System.out.println("Welcome to the Library Management System!");
    }
}

package com.mycompany.librarymanagementsystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryUI {
    private Library library;

    public LibraryUI(Library library) {
        this.library = library;
        initializeUI();
    }

    private void initializeUI() {
        JFrame frame = new JFrame("Library Management System");
        JButton addBookButton = new JButton("Add Book");
        JButton registerUserButton = new JButton("Register User");
        JButton borrowBookButton = new JButton("Borrow Book");
        JButton returnBookButton = new JButton("Return Book");
        JButton viewBooksButton = new JButton("View Books");

        // Action for adding a book
        addBookButton.addActionListener(e -> {
            String title = JOptionPane.showInputDialog("Enter Book Title:");
            String author = JOptionPane.showInputDialog("Enter Author:");
            String isbn = JOptionPane.showInputDialog("Enter ISBN:");
            library.addBook(new Book(title, author, isbn));
            JOptionPane.showMessageDialog(frame, "Book added successfully!");
        });

        // Action for registering a user
        registerUserButton.addActionListener(e -> {
            String[] options = {"Member", "Librarian"};
            int choice = JOptionPane.showOptionDialog(frame, "Select User Type:", "User Type",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            String name = JOptionPane.showInputDialog("Enter User Name:");
            String userId = JOptionPane.showInputDialog("Enter User ID:");
            if (choice == 0) {
                library.registerUser(new Members(name, userId));
            } else if (choice == 1) {
                library.registerUser(new Librarian(name, userId));
            }
            JOptionPane.showMessageDialog(frame, "User registered successfully!");
        });

        // Action for borrowing a book
        borrowBookButton.addActionListener(e -> {
            String userId = JOptionPane.showInputDialog("Enter User ID:");
            String isbn = JOptionPane.showInputDialog("Enter Book ISBN:");
            User user = library.findUserById(userId);
            Book book = library.findBookByIsbn(isbn);
            if (user instanceof Members && book != null) {
                ((Members) user).borrowBook(library, book);
                JOptionPane.showMessageDialog(frame, "Book borrowed successfully!");
            } else {
                JOptionPane.showMessageDialog(frame, "Borrowing failed. Check user ID or book availability.");
            }
        });

        // Action for returning a book
        returnBookButton.addActionListener(e -> {
            String userId = JOptionPane.showInputDialog("Enter User ID:");
            String isbn = JOptionPane.showInputDialog("Enter Book ISBN:");
            User user = library.findUserById(userId);
            Book book = library.findBookByIsbn(isbn);
            if (user instanceof Members && book != null) {
                ((Members) user).returnBook(book);
                JOptionPane.showMessageDialog(frame, "Book returned successfully!");
            } else {
                JOptionPane.showMessageDialog(frame, "Returning failed. Check user ID or book.");
            }
        });

        // Action for viewing books
        viewBooksButton.addActionListener(e -> {
            StringBuilder bookList = new StringBuilder("Books in the Library:\n\n");
            bookList.append(String.format("%-30s %-20s %-15s %-10s%n", "Title", "Author", "ISBN", "Available"));
            bookList.append("-------------------------------------------------------------\n");
            
            for (Book book : library.getBooks()) {
                bookList.append(String.format("%-30s %-20s %-15s %-10s%n",
                    book.getTitle(),
                    book.getAuthor(),
                    book.getIsbn(),
                    book.isIsAvailable() ? "Yes" : "No"));
            }
            
            if (library.getBooks().isEmpty()) {
                bookList.append("No books available in the library.");
            }
            
            JOptionPane.showMessageDialog(frame, bookList.toString());
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(addBookButton);
        frame.add(registerUserButton);
        frame.add(borrowBookButton);
        frame.add(returnBookButton);
        frame.add(viewBooksButton);
        frame.setVisible(true);
    }
}

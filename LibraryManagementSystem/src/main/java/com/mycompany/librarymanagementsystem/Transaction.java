package com.mycompany.librarymanagementsystem;

import java.time.LocalDateTime;

public class Transaction {
    private Book book;
    private User user;
    private String transactionType;
    private final LocalDateTime transactionDate;

    public Transaction(Book book, User user, String transactionType) {
        this.book = book;
        this.user = user;
        this.transactionType = transactionType;
        this.transactionDate = LocalDateTime.now();
    }

    public Book getBook() { return book; }
    public User getUser() { return user; }
    public String getTransactionType() { return transactionType; }
    public LocalDateTime getTransactionDate() { return transactionDate; }
}

/*
*This class will represent a book in the library
*/
package com.mycompany.librarymanagementsystem;

/**
 *Date 2024-09-22
 * @author Jonathan Campbell
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;


//Constructor created
public Book(String title,String author,String isbn){
this.title = title;
this.author = author;
this.isbn = isbn;
this.isAvailable = true;
}

//We will need to add getters and setters for the books

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    //Adding a method to borrow the book if it availabe or not
    public void borrow(){
    if(isAvailable){
    isAvailable = false;
    }else{
    throw new IllegalStateException("This book is not available.");
    }
   }
    //This is a method to return the book if the book is availale 
    
    public void returnBook(){
    if(isAvailable){
    isAvailable = true;
    }
    }
}
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author JOnathan
 */
public class Members extends User {
    
    public Members(String name, String userID) {
        super(name, userID);
    }
    
    /**
     *@param
     * @param library
     * @param book
     */
    public void borrowBook(Library library, Book book){
    if(book.isIsAvailable()){
    book.borrow();
     }
    }
    
    public void returnBook(Book book){
    book.returnBook();
    }
}

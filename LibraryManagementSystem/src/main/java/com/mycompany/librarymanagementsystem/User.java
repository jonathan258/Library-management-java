package com.mycompany.librarymanagementsystem;

/**
 *
 * @author Jonathan Campebll
 */
public class User {
    private final String name;
    private final  String userID;


//constuctor
public User(String name,String userID ){

this.name = name;
this.userID = userID;
}
public String getName(){return name;}
public String getUserID(){return userID;}
}
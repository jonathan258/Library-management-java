Introduction
The Library Management System is a Java-based application designed to manage the operations of a library. It allows users to add books, register members, borrow and return books, and view available books. The system follows Object-Oriented Programming (OOP) principles.

NOTE"username for admin is admin admin, member member. If you want add a book or return register A user or use the registerd user admin or member to do so "

Features
Add Books: Librarians can add new books to the library.
Register Users: Users can be registered as members or librarians.
Borrow and Return Books: Members can borrow and return books.
View Books: Users can view the list of available books with details.
Technologies Used
Java
Java Swing for the User Interface
Maven for project management
Installation
Clone the Repository:

bash
Copy code
git clone https://github.com/yourusername/library-management-system.git
Navigate to the Project Directory:

bash
Copy code
cd library-management-system
Open the Project: Use an IDE like NetBeans or IntelliJ IDEA.

Build the Project: Use Maven to build the project.

Usage
Run the LibraryManagementSystem class.
Follow the prompts in the graphical user interface to interact with the library system.
You can add books, register users, borrow or return books, and view all books in the library.
Classes Overview
Book: Represents a book in the library, with attributes for title, author, ISBN, and availability status.

User: Base class for users of the library, containing common attributes like name and user ID.

Members: Inherits from User, representing regular members who can borrow and return books.

Librarian: Inherits from User, representing librarians who can manage books and users.

Admin: (Optional) Inherits from User, representing an admin user with elevated privileges.

Library: Manages collections of books, users, and transactions.

Transaction: Represents a borrowing or returning action, tracking which book was involved and by whom.

LibraryUI: Manages the graphical user interface for the library system.
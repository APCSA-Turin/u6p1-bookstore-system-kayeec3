package com.example.project;

public class User {
    // Requires 3 private attributes: name, Id, and an array of Book objects initialized to empty
    private String name;
    private String Id;
    private Book books[] = new Book[5]; // Array to hold up to 5 books

    // Requires 1 constructor with two parameters that will initialize the name and Id
    public User(String name1, String Id1) {
        this.name = name1;
        this.Id = Id1;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    // Getter and setter for Id
    public String getId() {
        return Id;
    }

    public void setId(String newId) {
        this.Id = newId;
    }

    // Getter and setter for books
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books1) {
        this.books = books1;
    }

    // Returns a book list for the user, with "empty" if the slot is empty
    public String[] bookListInfo() {
        String[] temp = new String[5];
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                temp[i] = "empty";
            } else {
                temp[i] = books[i].bookInfo();
            }
        }
        return temp;
    } // Returns a booklist for the user; if empty, output "empty"

    // Returns the user information in the required format
    public String userInfo() {
        StringBuilder booksInfo = new StringBuilder();
        String[] bookList = bookListInfo();

        for (String info : bookList) {
            booksInfo.append(info).append("\n");
        }

        return "Name: " + getName() + "\nId: " + getId() + "\nBooks: \n" + booksInfo.toString();
    } // Returns "Name: []\nID: []\nBooks:\n[]"
}

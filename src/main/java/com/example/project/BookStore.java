package com.example.project;

public class BookStore{

    // requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users)
    private Book books[] = new Book[5];
    private User users[] = new User[10];

    // requires 1 empty constructor
    public BookStore() {}

    // public getUsers(){}
    public User[] getUsers() {
        return users;
    }

    // public setUsers(){}
    public void setUsers(User[] user1) {
        users = user1;
    }

    // public getBooks(){}
    public Book[] getBooks() {
        return books;
    }

    // public void addUser(User user){}
    public void addUser(User user) {
        int i = 0;
        while (users[i] != null) {
            i++;
        }
        users[i] = user;
    }

    // public void removeUser(User user){}
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                // Shift all users after the removed one to the left
                for (int j = i; j < users.length - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[users.length - 1] = null; // Set the last position to null
                break;
            }
        }
    }

    // public void consolidateUsers(){}
    public void consolidateUsers() {
        int j = 0;
        //Removes all the null in the list
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                users[j] = users[i];
                if (i != j) {
                    users[i] = null;
                }
                j++;
            }
        }
    }

    // public void addBook(Book book){}
    public void addBook(Book book) {
        int i = 0;
        while (books[i] != null) {
            i++;
        }
        books[i] = book;
    }

    // public void insertBook(Book book, int index){}
    public void insertBook(Book book, int index) {
        if (index < 0 || index >= books.length) {
            return; // out of bounds then do nothing
        }
        Book[] temp = new Book[books.length];
        for (int i = 0; i < index; i++) {
            temp[i] = books[i];
        }
        temp[index] = book;
        for (int i = index + 1; i < books.length; i++) {
            temp[i] = books[i - 1];
        }
        books = temp;
    }

    // public void removeBook(Book book){}
    public void removeBook(Book book) {
        String name = book.getTitle();
        //get the name of the book that is going to be removed
        for (int i = 0; i < books.length; i++) {
            //compare it with each book in the list
            if (books[i] != null && books[i].getTitle().equals(name)) {
                //if is found, quantity decrease by one
                if (books[i].getQuantity() > 1) {
                    books[i].setQuantity(books[i].getQuantity() - 1);
                } else {
                    //if there is only one copy, then it will be empty
                    books[i] = null;
                }
                //exist the loop once the book is found
                break;
            }
        }
        // Shift the remaining books to fill in the gaps.
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null && books[i + 1] != null) {
                //move the book one place forward
                books[i] = books[i + 1];
                books[i + 1] = null;
            }
        }
        // Create a new list with no null entries.
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                //find the length of the list without null value
                index++;
            }
        }
        Book[] newList = new Book[index];
        for (int i = 0; i < index; i++) {
            //New list without null
            newList[i] = books[i];
        }
        //Set book to the new list without any null
        books = newList;
    }
    
    
    
    // public String bookStoreBookInfo(){} // you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} // you are not tested on this method but use it for debugging purposes
}

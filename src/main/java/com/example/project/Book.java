package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    //Get title method
    public String getTitle() {
        return title;
    }
    //Set title method
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int newYear) {
        yearPublished = newYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuant) {
        quantity = newQuant;
    }

    public String bookInfo(){
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Year: " + getYearPublished() + ", ISBN: " + getIsbn() + ", Quantity: " + getQuantity();
    } 
    //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []
    }
    
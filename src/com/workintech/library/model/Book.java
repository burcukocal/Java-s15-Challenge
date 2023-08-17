package com.workintech.library.model;

public abstract class Book {
    private int id;
    private String name;
    private String author;
    private Category category;
    private boolean isAvailable;
    private double price;

    public Book(String name) {
        this.name = name;
    }

    public Book(int id, String name, String author, Category category, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.isAvailable = false;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getBookType();

    @Override
    public String toString() {
        return "Book{" +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                '}';
    }
}

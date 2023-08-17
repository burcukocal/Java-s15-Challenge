package com.workintech.library.model;

public class Magazines extends Book{
    public Magazines(int id, String name, String author, Category category) {
        super(id, name, author, category, 40);
    }

    public Magazines(String name) {
        super(name);
    }

    @Override
    public String getBookType() {
        return "Magazine";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

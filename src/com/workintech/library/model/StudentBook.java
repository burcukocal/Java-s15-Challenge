package com.workintech.library.model;

public class StudentBook extends Book{
    public StudentBook(int id, String name, String author, Category category) {
        super(id, name, author, category, 80);
    }

    public StudentBook(String name) {
        super(name);
    }

    @Override
    public String getBookType() {
        return "StudentBook";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

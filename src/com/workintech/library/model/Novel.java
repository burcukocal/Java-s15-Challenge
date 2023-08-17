package com.workintech.library.model;

public class Novel extends Book{
    public Novel(String name) {
        super(name);
    }

    public Novel(int id, String name, String author, Category category) {
        super(id, name, author, category, 45);


    }
    @Override
    public String getBookType() {
        return "Novel";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

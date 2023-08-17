package com.workintech.library.model;

public class ComicBook extends Book{

    public ComicBook(String name) {
        super(name);
    }

    public ComicBook(int id, String name, String author, Category category) {
        super(id, name, author, category, 75);
    }

    @Override
    public String getBookType() {
        return "comicBook";
    }

}

package com.workintech.library.operations;

import com.workintech.library.model.Book;
import com.workintech.library.model.Category;

import java.util.*;

public class Library {
    private Map<String, Book> books;
    private Set<Category> categories;


    public Library() {
        books = new HashMap<>();
        categories = new HashSet<>();
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.put(book.getName(), book);
        categories.add(book.getCategory());
    }

    public void removeBook(String bookName) {
        Book book = books.get(bookName);
        if (book != null) {
            books.remove(bookName);
            categories.remove(book.getCategory());
        }
    }

    public void updateBook(int id, String name, String author, Category category) {
        Book book = books.get(id);
        if (book != null) {
            book.setName(name);
            book.setAuthor(author);
            book.setCategory(category);
        }
    }
    public List<Book> getBooksByCategory(String category) {
        List<Book> categoryBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getCategory().equals(category)) {
                categoryBooks.add(book);
            }
        }
        System.out.println(category + " kategorsindeki tüm kitaplar: " + books.toString());
        return categoryBooks;
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorBooks.add(book);
            }
        }
        System.out.println(author + " yazarın tüm kitapları: " + authorBooks);
        return authorBooks;
    }


    @Override
    public String toString() {
        return "Library{" + books +
                ", categories=" + categories +
                '}';
    }
}

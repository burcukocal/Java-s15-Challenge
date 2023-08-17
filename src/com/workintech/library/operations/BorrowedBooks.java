package com.workintech.library.operations;

import com.workintech.library.model.Book;
import com.workintech.library.model.Member;

import java.util.HashMap;
import java.util.Map;

public class BorrowedBooks {

    private Map<Book, Member> borrowedBooks;
    private Library library;

    public BorrowedBooks() {
        this.borrowedBooks = new HashMap<>();
        this.library = new Library();
    }

    public Map<Book, Member> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Member member, Book book) {
        if (!borrowedBooks.containsKey(book) && borrowedBooks.size() < 5) {
            borrowedBooks.put(book, member);
            book.setAvailable(true);
            System.out.println(member.getFullName() + " kullanıcısı " + book.getName() + " kitabını ödünç aldı.");
        } else {
            System.out.println("Kitap limitine ulaşıldı. Daha fazla kitap alamazsınız.");
        }
    }


}

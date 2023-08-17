package com.workintech.library.main;

import com.workintech.library.model.*;
import com.workintech.library.operations.BorrowedBooks;
import com.workintech.library.operations.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad-soyad giriniz: ");
        String fullName = scanner.nextLine();

        Member member = new Member(fullName);


        Library library = new Library();
        BorrowedBooks borrowedBooks = new BorrowedBooks();
        Invoice invoice = new Invoice(member);


        Category fiction = new Category("fantasy");
        Category nonFiction = new Category("Non-Fiction");

        Book book1 = new Novel(1, "Harry Potter ve Felsefe Taşı", "JK. Rowling", fiction);
        Book book2 = new Novel(2, "Harry Potter ve Sırlar Odası", "JK. Rowling", fiction);
        Book book3 = new Novel(3, "Harry Potter ve Azkaban Tutsağı", "JK. Rowling", fiction);
        Book book4 = new Novel(4, "Harry Potter ve Ateş Kadehi", "JK. Rowling", fiction);
        Book book5 = new Novel(5, "Harry Potter ve Zümrüdüanka Yoldaşlığı", "JK. Rowling", fiction);
        Book book6 = new Novel(6, "Harry Potter ve Melez Prens", "JK. Rowling", fiction);
        Book book7 = new Novel(7, "Harry Potter ve Ölüm Yadigârları", "JK. Rowling", fiction);
        Book book8 = new ComicBook(8, "Batman Öldüren Şaka" , "Alan Moore", fiction);
        Book book9 = new StudentBook(9, "Linear Algebra Done Right", "Sheldon Axler", nonFiction);
        Book book10 = new StudentBook(10, "Classical Mechanics", "Herbert Goldstein", nonFiction);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);



        while (true) {
            System.out.println("1 - Ödünç Kitap Alma");
            System.out.println("2 - Kitap İade Et");
            System.out.println("3 - Yazarına göre kitaplar");
            System.out.println("4 - Kategorisine göre kitaplar");
            System.out.println("0 - Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçin: ");
            int process = scanner.nextInt();
            scanner.nextLine();

            switch (process) {
                case 0:
                    System.out.println("Uygulama sonlandırılıyor.");
                    scanner.close();
                    return;

                case 1:
                    System.out.print("Ödünç alınacak kitap adını giriniz: ");
                    String bookName = scanner.nextLine();
                    Book book = library.getBooks().get(bookName);

                    if (library.getBooks().containsKey(bookName)) {
                        borrowedBooks.borrowBook(member, book);
                        invoice.generateInvoice(book);
                    } else {
                        System.out.println("Kitap bulunamadı.");
                    }
                    break;

                case 2:
                    System.out.print("İade edilecek kitap adını giriniz: ");
                    String borrowedBookName = scanner.nextLine();
                    Book borrowedBook = library.getBooks().get(borrowedBookName);

                    if (borrowedBook != null) {
                        invoice.returnBook(borrowedBook);
                    } else {
                        System.out.println("Kitap bulunamadı.");
                    }
                    break;
                case 3:
                    System.out.println("Aradığınız yazarın ismini giriniz: ");
                    String authorName = scanner.nextLine();
                    authorName = authorName.toLowerCase();
                    library.getBooksByAuthor(authorName);
                    break;
                case 4:
                    System.out.println("Aradığınız kategori ismini giriniz: ");
                    String categoryName = scanner.nextLine();
                    categoryName = categoryName.toLowerCase();
                    library.getBooksByCategory(categoryName);
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
                    break;
            }
        }
    }
}
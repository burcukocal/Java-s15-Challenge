package com.workintech.library.main;

import com.workintech.library.model.*;
import com.workintech.library.operations.Library;

import java.util.Scanner;

public class LibrarianMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Librarian librarian = new Librarian();


        System.out.print("Kullanıcı Adı: ");
        String username = scanner.nextLine();
        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        if (librarian.login(username, password)) {
            System.out.println("Giriş Başarılı! Hoş geldiniz, " + username);

            while (true) {
                System.out.println("\nYapmak istediğiniz işlemi seçin:");
                System.out.println("1. Kitap Ekle");
                System.out.println("2. Kitap Çıkar");
                System.out.println("3. Kitap Bilgilerini Güncelle");
                System.out.println("0. Çıkış");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Kitap Adı: ");
                        String bookName = scanner.nextLine();
                        System.out.println("Yazar: ");
                        String author = scanner.nextLine();
                        System.out.println("Tür (1: Roman, 2: Çizgi Roman, 3: Öğrenci Kitabı, 4: Dergi): ");
                        int choice2 = scanner.nextInt();
                        System.out.println("Kitap Kategorisi: ");
                        String category = scanner.nextLine();
                        scanner.nextLine();

                        Book book;
                        if (choice2 == 1) {
                            book = new Novel(1,bookName, author, new Category(category));
                        } else if (choice2 == 2) {
                            book = new ComicBook(1,bookName, author, new Category(category));
                        } else if (choice2 == 3) {
                            book = new StudentBook(1,bookName, author, new Category(category));
                        } else if (choice2 == 4) {
                            book = new Magazines(1,bookName, author, new Category(category));
                        } else {
                            System.out.println("Geçersiz tür seçimi.");
                            continue;
                        }
                        library.addBook(book);
                        break;

                    case 2:
                        System.out.print("Çıkarılacak Kitap Adı: ");
                        String removeBook = scanner.nextLine();
                        library.removeBook(removeBook);
                        break;

                    case 3:
                        System.out.print("Düzenlenecek Kitap Adı: ");
                        String updateBookName = scanner.nextLine();

                        break;

                    case 0:
                        System.out.println("Çıkış yapılıyor...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
                }
            }
        } else {
            System.out.println("Giriş Başarısız! Kullanıcı adı veya şifre hatalı.");
        }
    }
}

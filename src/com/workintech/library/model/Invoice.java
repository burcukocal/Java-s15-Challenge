package com.workintech.library.model;

import java.util.HashMap;
import java.util.Map;

public class Invoice {
    private Map<Member, Double> invoices;
    private Member member;


    public Invoice(Member member) {
        this.invoices = new HashMap<>();
        this.member = member;
    }

    public void generateInvoice (Book book){
        double amount = book.getPrice();
        invoices.put(member, amount);
        System.out.println("Fatura oluşturuldu: " + member.getFullName() + " kullanıcısına " + book.getName() + " Kitabı için " + amount + " TL");
    }

    public void returnBook(Book book) {
        double amountToRefund = invoices.get(member);
        book.setAvailable(false);
        invoices.remove(member);
        System.out.println(member.getFullName() + " kullanıcısı " + book.getName() + " kitabını iade etti. Ücret iadesi: " + amountToRefund);
    }
}

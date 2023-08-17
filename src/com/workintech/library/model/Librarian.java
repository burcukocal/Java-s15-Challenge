package com.workintech.library.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Librarian {

    private Map<String, String> librarian;

    public Librarian() {
        librarian = new HashMap<>();
        librarian.put("kutuphane", "sifre123");
    }

    public void addLibrarian(String name, String password){
        librarian.put(name, password);
    }

    public boolean login(String username, String password) {
        return librarian.containsKey(username) && librarian.get(username).equals(password);
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "librarian=" + librarian +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Librarian librarian1 = (Librarian) o;
        return Objects.equals(librarian, librarian1.librarian);
    }

    @Override
    public int hashCode() {
        return Objects.hash(librarian);
    }
}
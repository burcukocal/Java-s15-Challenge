package com.workintech.library.model;

import java.util.HashMap;
import java.util.Map;

public class Member {
    private int id;
    private String fullName;

    public Member(String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


    @Override
    public String toString() {
        return "Member{" + "Ad Soyad:'" + fullName + '\'' + '}';
    }
}

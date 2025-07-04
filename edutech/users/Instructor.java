package com.flexisaf.edutech.edutech.users;

public class Instructor {
    private String name;
    private String email;

    public Instructor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void login() {
        System.out.println("Instructor " + name + " logged in.");
    }

    public String toString() {
        return name + " (" + email + ")";
    }
}
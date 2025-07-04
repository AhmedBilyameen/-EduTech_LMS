package com.flexisaf.edutech.edutech.users;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void login() {
        System.out.println("Student " + name + " logged in.");
    }

    public String toString() {
        return name + " (" + email + ")";
    }
}
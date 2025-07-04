package com.flexisaf.edutech.edutech.Models;

import com.flexisaf.edutech.edutech.Abstracts.User;
import com.flexisaf.edutech.edutech.Interfaces.Authenticatable;
import com.flexisaf.edutech.edutech.Interfaces.Rateable;

public class Student extends User implements Authenticatable, Rateable {
    private double rating;

    public Student(String name, String email) {
        super(name, email);
        this.rating = 0;
    }

    public void login() {
        System.out.println(name + " logged in as Student.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void resetPassword() {
        System.out.println("Password reset link sent to " + email);
    }

    public void rateCourse(Object course, int rating) {
        this.rating = rating;
        System.out.println("Rated course: " + rating + " stars.");
    }

    public double getRating() {
        return this.rating;
    }

    public void review(String feedback) {
        System.out.println("Review: " + feedback);
    }
}
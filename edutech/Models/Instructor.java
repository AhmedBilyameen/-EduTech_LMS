package com.flexisaf.edutech.edutech.Models;

import com.flexisaf.edutech.edutech.Abstracts.User;
import com.flexisaf.edutech.edutech.Interfaces.Authenticatable;
import com.flexisaf.edutech.edutech.Interfaces.Schedulable;

public class Instructor extends User implements Authenticatable, Schedulable {

    public Instructor(String name, String email) {
        super(name, email);
    }

    public void login() {
        System.out.println(name + " logged in as Instructor.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void resetPassword() {
        System.out.println("Password reset link sent to " + email);
    }

    public void schedule() {
        System.out.println("Class scheduled.");
    }

    public void reschedule() {
        System.out.println("Class rescheduled.");
    }

    public void cancel() {
        System.out.println("Class cancelled.");
    }
}
package com.flexisaf.edutech.edutech.users;

import com.flexisaf.edutech.edutech.enums.Role;

public class Admin {
    private String name;
    private String email;

    public Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void viewSystemStatus() {
        System.out.println("Admin system check: All systems running fine.");
    }

    public void registerUser(Object user, Role role) {
        System.out.println("Registered new " + role + ": " + user.toString());
    }
}
package com.flexisaf.edutech.edutech.system;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private static final Map<String, String> credentials = new HashMap<>();

    static {
        credentials.put("musa@edutech.com", "pass123");
        credentials.put("zainab@student.com", "student123");
        credentials.put("admin@edutech.com", "admin123");
    }

    public boolean authenticate(String email, String password) {
        return credentials.containsKey(email) && credentials.get(email).equals(password);
    }

    public void printUsers() {
        System.out.println("Registered Users:");
        credentials.keySet().forEach(System.out::println);
    }
}
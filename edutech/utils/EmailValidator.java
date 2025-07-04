package com.flexisaf.edutech.edutech.utils;

public class EmailValidator {
    public static boolean isValid(String email) {
        return email != null && email.contains("@") && email.endsWith(".com");
    }
}
package com.flexisaf.edutech.edutech;

import com.flexisaf.edutech.edutech.users.Admin;
import com.flexisaf.edutech.edutech.users.Instructor;
import com.flexisaf.edutech.edutech.users.Student;
import com.flexisaf.edutech.edutech.enums.Role;

public class EduTechApp {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin Flexi", "admin@edutech.com");
        Instructor instructor = new Instructor("Dr. Musa", "musa@edutech.com");
        Student student = new Student("Zainab", "zainab@student.com");

        admin.viewSystemStatus();
        instructor.login();
        student.login();

        admin.registerUser(instructor, Role.INSTRUCTOR);
        admin.registerUser(student, Role.STUDENT);
    }
}
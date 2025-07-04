package com.flexisaf.edutech;

import com.flexisaf.edutech.edutech.Models.*;
import com.flexisaf.edutech.edutech.Models.Assignment;
//import com.flexisaf.edutech.edutech.users.Instructor;
//import com.flexisaf.edutech.edutech.users.Student;

public class EduTechMain {
    public static void main(String[] args) {
        Instructor bilya = new Instructor("Bilyaminu", "bilya@flexisaf.com");
        Student amina = new Student("Amina", "amina@student.com");

        Course java = new Course("Java OOP", "Deep dive into Java's object-oriented features");
        Assignment project = new Assignment("Week 8 Project", "Build a complex Java system with packages");

        java.addContent(project);
        java.render();

        bilya.login();
        amina.login();

        amina.rateCourse(java, 5);
        amina.review("Excellent OOP structure!");

        bilya.schedule();
        project.schedule();

        Message msg = new Message("Welcome to EduTech!", "Amina");
        msg.sendNotification();
    }
}
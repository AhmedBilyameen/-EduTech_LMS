package com.flexisaf.edutech.edutech.Models;

import com.flexisaf.edutech.Abstracts.CourseContent;
import com.flexisaf.edutech.edutech.Interfaces.Manageable;

import java.util.ArrayList;
import java.util.List;

public class Course extends CourseContent implements Manageable {
    private List<CourseContent> contents;

    public Course(String title, String description) {
        super(title, description);
        this.contents = new ArrayList<>();
    }

    public void render() {
        System.out.println("Course: " + title + " - " + description);
    }

    public void addContent(CourseContent content) {
        contents.add(content);
    }

    public void add() {
        System.out.println("Course added.");
    }

    public void remove() {
        System.out.println("Course removed.");
    }

    public void update() {
        System.out.println("Course updated.");
    }
}
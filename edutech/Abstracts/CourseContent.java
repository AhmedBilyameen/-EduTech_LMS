package com.flexisaf.edutech.Abstracts;

public abstract class CourseContent {
    protected String title;
    protected String description;

    public CourseContent(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract void render();

    public String getTitle() { return title; }
    public String getDescription() { return description; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
}
package com.flexisaf.edutech.edutech.Models;

import com.flexisaf.edutech.Abstracts.CourseContent;
import com.flexisaf.edutech.edutech.Interfaces.Schedulable;

public class Assignment extends CourseContent implements Schedulable {

    public Assignment(String title, String description) {
        super(title, description);
    }

    public void render() {
        System.out.println("Assignment: " + title + " - " + description);
    }

    public void schedule() {
        System.out.println("Assignment scheduled.");
    }

    public void reschedule() {
        System.out.println("Assignment rescheduled.");
    }

    public void cancel() {
        System.out.println("Assignment cancelled.");
    }
}
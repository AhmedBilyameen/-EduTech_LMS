package com.flexisaf.edutech.edutech.system;

import java.util.HashMap;
import java.util.Map;

public class RatingService {
    private Map<String, Integer> courseRatings = new HashMap<>();

    public void rateCourse(String courseName, int rating) {
        courseRatings.put(courseName, rating);
        System.out.println("Rated " + courseName + ": " + rating + " star(s).");
    }

    public void viewRatings() {
        courseRatings.forEach((course, rating) -> 
            System.out.println("Course: " + course + " -> " + rating + " stars"));
    }
}
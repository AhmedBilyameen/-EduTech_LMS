package com.flexisaf.edutech.edutech.Interfaces;

public interface Rateable {
    void rateCourse(Object course, int rating);
    double getRating();
    void review(String feedback);
}
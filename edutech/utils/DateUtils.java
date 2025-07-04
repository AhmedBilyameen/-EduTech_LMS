package com.flexisaf.edutech.edutech.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String getToday() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }

    public static boolean isPastDeadline(String deadlineDate) {
        LocalDate deadline = LocalDate.parse(deadlineDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return LocalDate.now().isAfter(deadline);
    }
}
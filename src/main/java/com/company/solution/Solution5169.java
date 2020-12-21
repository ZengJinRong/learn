package com.company.solution;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * 5169. 日期之间隔几天
 */
public class Solution5169 {
    public int daysBetweenDates(String date1, String date2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(date1, dateTimeFormatter);
        LocalDate localDate2 = LocalDate.parse(date2, dateTimeFormatter);
        long until = localDate1.until(localDate2, ChronoUnit.DAYS);
        return (int) Math.abs(until);
    }
}

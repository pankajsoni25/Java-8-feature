package com.test.date;

import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;


/*
* http://www.java2s.com/Tutorials/Java/Data_Type_How_to/Date/Add_days_and_year_to_local_date.htm
* */
public class TestLocalDate {


    public static void main(String[] args) {

        System.out.println("Pankaj");

        LocalDate initial = LocalDate.of(2014, 2, 13);
        LocalDate start = initial.withDayOfMonth(2);
        LocalDate startt = initial.with(firstDayOfMonth());

        LocalDate end = initial.with(lastDayOfMonth());

        System.out.println(initial);
        System.out.println(start);
        System.out.println(startt);
        System.out.println(end);

    }


}

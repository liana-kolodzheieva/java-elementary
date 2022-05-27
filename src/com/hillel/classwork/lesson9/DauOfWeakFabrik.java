package com.hillel.classwork.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class DauOfWeakFabrik {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input day of weak   ");
        System.out.println(Arrays.toString(DayOfWeak.values()));
        String day = reader.readLine().toUpperCase(Locale.ROOT);
        DayOfWeak dayOfWeak = DayOfWeak.valueOf(day);
        System.out.println(createTask(dayOfWeak));
    }
    private static String createTask(DayOfWeak dayOfWeak){
        String task = " ";
        switch (dayOfWeak){
            case MONDAY:
                task = " Today washing window";
                break;
            case TUESDAY:
                task = " Today puring flower";
                break;
            case WEDNESDAY:
                task = " Today washing table";
                break;
            case THURSDAY:
                task = " Today washing board";
                break;
            case FRIDAY:
                task = " Today harmonizing books";
                break;
            case SATURDAY:
                task = " Today hanging curtains";
                break;
            case SUNDAY:
                task = " Today cooking dinner";
                break;

        }


        return task;
    }}

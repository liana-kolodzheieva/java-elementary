package com.hillel.classwork.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sceduler {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input day of weak   ");
        System.out.println(Arrays.toString(DayOfWeak.values()));
        String day = reader.readLine().toUpperCase(Locale.ROOT);
        DayOfWeak dayOfWeak = DayOfWeak.valueOf(day);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Liana", DayOfWeak.THURSDAY));
        students.add(new Student("Maksim", DayOfWeak.FRIDAY));
        students.add(new Student("Liza", DayOfWeak.MONDAY));
        students.add(new Student("Mariana", DayOfWeak.SATURDAY));
        students.add(new Student("Vova", DayOfWeak.SUNDAY));
        students.add(new Student("Nikita", DayOfWeak.TUESDAY));
        students.add(new Student("Sofia", DayOfWeak.WEDNESDAY));

        Map<DayOfWeak, Student> map = new HashMap<>();
        for (Student student : students) {
            System.out.println(student);
            map.put(student.getSchendulAt(), student);
        }

        Student Schendul = map.get(dayOfWeak);
        System.out.println(Schendul.getName() + " is on duty on " + dayOfWeak);

        for (Student student : students) {
            System.out.println(student);
            if (dayOfWeak.equals(student.getSchendulAt())) {
                System.out.println(student.getName() + " is on duty on " + dayOfWeak);
            }
        }



    }
}


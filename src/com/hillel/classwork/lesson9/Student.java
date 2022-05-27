package com.hillel.classwork.lesson9;

public class Student {
  private   String name;

    private   DayOfWeak schendulAt;


    public Student(String name, DayOfWeak schendulAt) {
        this.name = name;
        this.schendulAt = schendulAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DayOfWeak getSchendulAt() {
        return schendulAt;
    }

    public void setSchendulAt(DayOfWeak schendulAt) {
        this.schendulAt = schendulAt;
    }
}

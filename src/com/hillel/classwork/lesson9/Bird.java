package com.hillel.classwork.lesson9;

public class Bird {
    private String color;

    public String getColor() {
        return color;
    }

    public Bird(String color){
        this.color = color;

    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                '}';
    }
}

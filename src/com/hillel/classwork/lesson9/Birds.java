package com.hillel.classwork.lesson9;
import java.util.Comparator;
import java.util.TreeSet;
public class Birds {
    public static void main(String[] args) {
        Comparator<Bird> comparator = new BirdColor();
        TreeSet<Bird>  birds = new TreeSet<>(comparator.reversed());
        birds.add(new Bird("red"));
        birds.add(new Bird("orange"));
        birds.add(new Bird("blue"));
        System.out.println(birds);

    }
}

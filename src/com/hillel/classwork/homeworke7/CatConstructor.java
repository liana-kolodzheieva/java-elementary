package com.hillel.classwork.homeworke7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatConstructor {
    private static Cat cat;

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Murka"));
        cats.add(new Cat("Murka"));
        cats.add(new Cat("Murka"));
        cats.add(new Cat("Murka"));
        cats.add(new Cat("Murka"));
        System.out.println(cats);


    }
    public static void addCatByName(List<Cat> cats, String name){
        Iterator<Cat> iterator = cats.iterator();
        while ((iterator.hasNext())) {
            Cat cat = iterator.next();
            if (cat.getName().equals(name)){
                cats.add(new Cat(name));
            }
        }
}}

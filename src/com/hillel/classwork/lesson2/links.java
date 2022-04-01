package com.hillel.classwork.lesson2;

public class links {
    public static void main(String[] args) {
        Cat cat = new Cat("Pixsel", 10);
        catAge(cat);


    }
    public static void catAge (Cat cat){
        System.out.println("before change " + cat.age);
        cat.age = 20;
        System.out.println("after change" + cat.age);

    }
}

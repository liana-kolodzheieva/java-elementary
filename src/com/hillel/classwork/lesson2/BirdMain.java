package com.hillel.classwork.lesson2;

public class BirdMain {

    public static void main(String[] args) {
        Bird bird1 = new Bird("Brown");
        bird1.speak();
        System.out.println(bird1);
        Bird bird2 = new Bird("Gray");
        System.out.println(bird2);
        Bird bird3 = new Bird("Red");
        System.out.println(bird3);
        Bird bird4 = new Bird("yellow");
        System.out.println(bird4);
        Bird bird5 = new Bird("green");
        System.out.println(bird5);
        Bird bird6 = new Bird("blue");
        System.out.println(bird6);
        Bird bird7 = new Bird("pink");
        System.out.println(bird7);
        Bird bird8 = new Bird("purple");
        System.out.println(bird8);
        Bird bird9 = new Bird("Orange");
        System.out.println(bird9);
        Bird bird10 = new Bird("red");
        System.out.println(bird10);
        Bird bird11 = new Bird("red");
        System.out.println(bird11);
        Bird bird12 = new Bird("red");
        System.out.println(bird12);
        Bird bird13 = new Bird("red");
        System.out.println(bird13);
        System.out.println(Bird.getCOUNT());
        System.out.println(Bird.COUNT);
        String color = bird1.getColor();
        System.out.println("color " + color);
        bird1.setColor("white");


    }
}

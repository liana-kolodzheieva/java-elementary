package com.hillel.classwork.lesson2;

public class Primitives {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Bfore metod" + number);
        changeNumber(number);
        System.out.println("after metod" + number);



    }
    public static void changeNumber (int number){
        System.out.println("got number " + number);
        number = 20;
        System.out.println("after change " + number);
    }
}

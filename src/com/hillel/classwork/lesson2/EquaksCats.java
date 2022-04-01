package com.hillel.classwork.lesson2;

public class EquaksCats {
    private String name;

    public static void main(String[] args) {
        Cat cat = new Cat("Pixsel", 2);
        Cat cat1 = new Cat("poc", 3);


        Cat cat2 = cat;

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);

        if (cat == cat2){
            System.out.println(cat + " and " + cat2 + " equals by link ");
        }
        else {
            System.out.println( cat + " and " + cat2 + " not equals by link");
        }

        if (cat.equals(cat1)){
            System.out.println(cat + " and " + cat1 + " equals by values");
        }
        else {
            System.out.println(cat + " and " + cat1 + " not equals by values");
        }

    }

}


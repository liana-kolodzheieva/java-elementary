package com.hillel.classwork.lasson4;

import java.util.ArrayList;

public class Zoo {


    public static void main(String[] args) {


        Animal cat = new Cat();
        setAnimalName(cat, "Pixcel");
        System.out.println("Cat: " + cat.name);
        cat.speak();

        Animal dog = new Dog();
        setAnimalName(dog, "Bim");
        System.out.println("Dog: " + dog.name);
        dog.speak();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        for (Animal animal : animals) {
            animal.speak();

        }

    }

    public static void setAnimalName(Animal animal, String name){
        animal.name = name;
    }
}

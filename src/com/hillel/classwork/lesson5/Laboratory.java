package com.hillel.classwork.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Laboratory {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        List<Plant> plants = new ArrayList<>();
        String actionMasage = "chose action: 1.create 2. exit";
        System.out.println(actionMasage);

        String input = SCANNER.nextLine();
        while ("create".equals(input.toLowerCase(Locale.ROOT).trim())) {
            Plant plant = createPlant();
            if (plant != null) {
                plants.add(plant);
            }

            System.out.println(actionMasage);
            input = SCANNER.nextLine();
        }
        for (Plant plant : plants) {
            plant.photosyntosis();
            //Dandelion dandelion = (Dandelion) plant;
        }
    }


    public static Plant createPlant() {
        System.out.println("input plans: orange, dendelion, cactus");
        String plantType = SCANNER.nextLine();
        switch (plantType.toLowerCase(Locale.ROOT).trim()) {
            case "orange":
                System.out.println("input orange age");
                int age = SCANNER.nextInt();
                return new Orange(age);

            case "dandelion":
                System.out.println("input dandelion age");
                int hight1 = SCANNER.nextInt();
                return new Dandelion(hight1);

            case "cactus":
                System.out.println("input cactus age");
                int hight2 = SCANNER.nextInt();
                return new Cactus(hight2);
        }
        System.out.println("incorrect plant type " + plantType + " try again" );


        return null;
    }
}

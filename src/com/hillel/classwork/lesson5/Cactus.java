package com.hillel.classwork.lesson5;

public class Cactus extends Plant {
    public Cactus (int height){
        super(height, "кактусовый");
        System.out.println("create cactus");
        // етод photosynthesis не переопределен поэтомубудет вызван родиельский
    }
}

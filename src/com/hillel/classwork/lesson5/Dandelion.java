package com.hillel.classwork.lesson5;

public class Dandelion extends Plant {
    public Dandelion(int height) {
        super(height, "сложноцвет");
        System.out.println("create dandelion");
    }
//так как мететод пееопределен в дочерном класе то будет вызван он а не родительский
    @Override
    public void photosynthesis() {
        System.out.println("dandelion photosynthesis: " + this.height);
        System.out.println("bloom now");

    }
}

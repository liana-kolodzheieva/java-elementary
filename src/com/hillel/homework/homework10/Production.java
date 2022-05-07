package com.hillel.homework.homework10;

public class Production  extends Property {

    public Production(int square, int taxK) {
        super(square, taxK);
    }

    @Override
    public String toString() {
        return "Production{" +
                "square=" + square +
                ", taxK=" + taxK +
                '}';
    }
}

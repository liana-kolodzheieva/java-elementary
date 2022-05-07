package com.hillel.homework.homework10;

public class Property {
    protected int square;
    protected int taxK;

    public Property(int square, int taxK) {
        this.taxK = taxK;
        this.square = square;
    }

    public int calculateTax() {
        return square * taxK;
    }


}


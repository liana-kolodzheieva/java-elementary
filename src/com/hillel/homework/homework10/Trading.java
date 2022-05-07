package com.hillel.homework.homework10;

public class Trading extends Property {
    private int income;

    public Trading(int square, int taxK, int income) {
        super(square, taxK);

    }

    @Override
    public int calculateTax() {
        if (income < 100) {
            return 0;
        } else {
            return super.calculateTax();
        }

    }

    @Override
    public String toString() {
        return "Trading{" +
                "income=" + income +
                ", square=" + square +
                ", taxK=" + taxK +
                '}';
    }
}

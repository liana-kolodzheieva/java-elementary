package com.hillel.homework.homework10;

public class Residential extends Property{
    private int subsidy;
    public Residential(int square, int taxK, int subsidy) {
        super(square, taxK);
        this.subsidy = subsidy;
    }
    @Override
    public int calculateTax() {
        int baseTax = super.calculateTax();
        int subsidyForTax = baseTax / 100 * subsidy;
        return baseTax - subsidyForTax;
    }

    @Override
    public String toString() {
        return "Residential{" +
                "subsidy=" + subsidy +
                ", square=" + square +
                ", taxK=" + taxK +
                '}';
    }
}

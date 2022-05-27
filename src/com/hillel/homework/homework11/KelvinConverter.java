package com.hillel.homework.homework11;

public class KelvinConverter implements Converter {
    @Override
    public double covert(double celsius) {
        return celsius + 273.15;
    }
}

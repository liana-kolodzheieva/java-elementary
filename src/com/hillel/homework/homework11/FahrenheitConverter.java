package com.hillel.homework.homework11;

public class FahrenheitConverter implements Converter{

    @Override
    public double covert(double celsius) {
        return celsius * 1.8 + 32;
    }
}

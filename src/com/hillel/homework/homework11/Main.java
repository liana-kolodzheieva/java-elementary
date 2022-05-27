package com.hillel.homework.homework11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Chose action: 1. Convert 2. Exit");
        while (!"exit".equals(bufferedReader.readLine().toLowerCase(Locale.ROOT).trim())) {
            convertTemperature();
            System.out.println("Chose action: 1. Convert 2. Exit");
        }
    }
    public static void convertTemperature() throws IOException {
        System.out.println("Input temperature in Celsius: ");
        double temperatureC = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Choose temperature: FAHRENHEIT or KELVIN");
        ConverterType type = ConverterType.valueOf(bufferedReader.readLine());
        Converter converter = createConverter(type);
        System.out.println("Temperature after convert: " + converter.covert(temperatureC));
    }
    public static Converter createConverter(ConverterType type) {
        switch (type) {
            case FAHRENHEIT:
                return new FahrenheitConverter();
            case KELVIN:
                return new KelvinConverter();
            default:
                throw new IllegalStateException("Type entered incorrectly: " + type);
        }
    }
}
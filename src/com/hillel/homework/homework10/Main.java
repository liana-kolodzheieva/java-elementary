package com.hillel.homework.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static final BufferedReader SCANNER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Property> properties = new ArrayList<>();
        String actionMasage = "chose action: 1.create 2. exit";
        System.out.println(actionMasage);

        String input = SCANNER.readLine();
        while ("create".equals(input.toLowerCase(Locale.ROOT).trim())) {
            Property property = createProperty();
            if (property != null) {
                properties.add(property);
            }

            System.out.println(actionMasage);
            input = SCANNER.readLine();
        }

        for (Property property : properties) {
            int tax = property.calculateTax();
            System.out.println(property + ": " + tax);

        }


    }

    public static Property createProperty() throws IOException {
        System.out.println("input property: Production, Residential, Trading");
        String propertyType = SCANNER.readLine();
        switch (propertyType.toLowerCase(Locale.ROOT).trim()) {
            case "production":
                int square = getSquare();
                int taxK = getTaxK();
                return new Production(square, taxK);

            case "residential":
                int square2 = getSquare();
                int taxK2 = getTaxK();
                int subsidy = getSubsidy();
                return new Residential(square2, taxK2, subsidy);

            case "trading":
                int square3 = getSquare();
                int taxK3 = getTaxK();
                int income = getIncome();
                return new Residential(square3, taxK3, income);
        }
        System.out.println("incorrect plant type " + propertyType + " try again");


        return null;
    }

    private static int getTaxK() throws IOException {
        System.out.println("input taxK");
        return Integer.parseInt(SCANNER.readLine());
    }

    private static int getSquare() throws IOException {
        System.out.println("input square");
        return Integer.parseInt(SCANNER.readLine());
    }

    private static int getSubsidy() throws IOException {
        System.out.println("input subsidy");
        return Integer.parseInt(SCANNER.readLine());

    }

    private static int getIncome() throws IOException {
        System.out.println("input income");
        return Integer.parseInt(SCANNER.readLine());

    }
}

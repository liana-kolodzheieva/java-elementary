package com.hillel.homework.homework13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Storage storage = new Storage();
        System.out.println("Input action: 1.ADD 2.REMOVE 3.exit");
        String input;
        while (!(input = READER.readLine()).equals("exit")) {
            chooseAction(Action.valueOf(input.toUpperCase().trim()), storage);
            storage.displayProducts();
            System.out.println("Input action: 1.ADD 2.REMOVE 3.exit");
        }



    }

    public static void chooseAction(Action action, Storage storage) throws IOException {
        switch (action) {
            case ADD:
                addProduct(storage);
                break;
            case REMOVE:
                removeProduct(storage);
                break;
            default:
                System.out.println("!ERROR! unknown action");
        }
    }

    public static void addProduct(Storage storage) throws IOException {
        System.out.println("Input name: ");
        String name = READER.readLine();
        System.out.println("Input amount: ");
        double amount = getNumber();
        System.out.println("Input weight: ");
        double weight = getNumber();
        System.out.println("Input price: ");
        double price = getNumber();
        storage.products.add(new Product(name, amount, weight, price));
    }

    public static double getNumber() {
        try {
            return Double.parseDouble(READER.readLine());
        } catch (Exception e) {
            System.out.println("invalid input, try again");
            return getNumber();
        }
    }

    public static void removeProduct(Storage storage) throws IOException {
        System.out.println("Input name: ");
        String deleteName = READER.readLine();
        int index = getIndex(storage, deleteName);
        if (index != -1) {
            storage.products.remove(index);
        }

    }

    public static int getIndex(Storage storage, String name) {
        int index = -1;
        for (Product product : storage.products) {
            if (product.name.equals(name)) {
                index = storage.products.indexOf(product);
                return index;
            }
        }
        return index;
        }
    }

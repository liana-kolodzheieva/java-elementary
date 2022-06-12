package com.hillel.homework.homework13;
import java.util.ArrayList;

public class Storage {
    @Override
    public String toString() {
        return "Storage{" +
                "products=" + products +
                '}';
    }

    ArrayList<Product> products = new ArrayList<>();
    public Storage() {
    }
    public void displayProducts(){
        System.out.println(this);
    }
}

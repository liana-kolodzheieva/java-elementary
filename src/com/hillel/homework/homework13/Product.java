package com.hillel.homework.homework13;

public class Product {
    String name;
    double amount;
    double weight;
    double price;

    public Product(String name, double amount, double weight, double price) {
        this.name = name;
        this.amount = amount;
        this.weight = weight;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

}

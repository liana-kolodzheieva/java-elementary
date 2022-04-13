package com.hillel.homework.Homework9;

public class Train extends Transport {

    private int places;

    public Train(int weight, int places) {
        super(weight);
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    private void drive() {
        System.out.println("train drive " + this);
    }

    @Override
    public void carry() {
        drive();
    }

    @Override
    public String toString() {
        return "Train{" +
                "places=" + places +
                ", weight=" + weight +
                '}';
    }
}

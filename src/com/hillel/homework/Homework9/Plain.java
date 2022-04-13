package com.hillel.homework.Homework9;

public class Plain extends Transport {
    private String whatCarries;

    public Plain(int weight, String whatCarries) {
        super(weight);
        this.whatCarries = whatCarries;
    }


    public String getWhatCarries() {
        return whatCarries;
    }

    private void fly() {
        System.out.println("plain fly " + this);
    }

    @Override
    public void carry() {
        fly();
    }

    @Override
    public String toString() {
        return "Plain{" +
                "whatCarries='" + whatCarries + '\'' +
                ", weight=" + weight +
                '}';
    }
}

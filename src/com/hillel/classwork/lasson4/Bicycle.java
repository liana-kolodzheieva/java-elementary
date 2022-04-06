package com.hillel.classwork.lasson4;

public class Bicycle {
    private int weight;
    private String model;

    public Bicycle(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public void ride() {
        System.out.println("bicycle" + model + " road now");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }

    public class StreengWheel {
        public void left() {
            System.out.println("Bicycle" + model + " left");
        }

        public void right() {
            System.out.println("Bicycle" + model + " right");
        }
    }

    public class Seat {
        public void up() {
            System.out.println("Bicycle" + model + " UP");
        }

        public void doun() {
            System.out.println("Bicycle" + model + " doun");
        }

    }

}

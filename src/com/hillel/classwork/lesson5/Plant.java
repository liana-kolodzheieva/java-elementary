package com.hillel.classwork.lesson5;

public class Plant {

    protected int height;
    protected String family;

    public Plant(int height, String family){
        this.height = height;
        this.family = family;
        System.out.println("create plant");

    }

    public int getHeight(){
        return height;
    }
    public String getFamily() {
        return family;
    }
    public void photosynthesis(){
        System.out.println("photosynthesis: " + this);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", family='" + family + '\'' +
                '}';
    }

    public void photosyntosis(){
        System.out.println("photosyntosis");
    }
}
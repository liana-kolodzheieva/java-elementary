package com.hillel.classwork.lasson4;

public class BicycleMain {
    public static void main(String[] args) {


    Bicycle bicycle = new Bicycle(10, "Ukraine");
        System.out.println(bicycle);
        bicycle.ride();
        Bicycle.StreengWheel streengWheel = bicycle.new StreengWheel();
        streengWheel.left();
        streengWheel.right();
        Bicycle.Seat seat = bicycle.new Seat();
        seat.up();
        seat.doun();



}}

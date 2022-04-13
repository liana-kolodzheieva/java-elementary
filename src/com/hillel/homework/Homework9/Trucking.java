package com.hillel.homework.Homework9;

import java.util.Scanner;

public class Trucking {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("write weight train:");
        int weight = Integer.parseInt(SCANNER.nextLine());
        System.out.println("write weight plain:");
        int weight1 =  Integer.parseInt(SCANNER.nextLine());
        System.out.println("write the number of cars in the train:");
        int places = Integer.parseInt(SCANNER.nextLine());
        System.out.println("write what the plane is carrying:");
        String cargo = SCANNER.nextLine();

        Transport plane = new Plain(weight1, cargo);
        Transport train = new Train(weight, places);

        plane.carry();
        train.carry();

    }
}

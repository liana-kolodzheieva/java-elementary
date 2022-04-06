package com.hillel.homework.homework7;

import java.util.Scanner;

public class HelpersMain {
    public static void main(String[] args) {
        System.out.println("введите координаты:");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double distance = Helpers.DistanceHelper.calculateDistance(x1,x2, y1, y2);
        System.out.println("√(( " + x1 + "-" + x2 + ")2 + (" + y1 + "-" + y2 + ")2) = " + distance);
}}

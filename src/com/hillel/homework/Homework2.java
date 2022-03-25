package com.hillel.homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
            System.out.println(array[i]);
        }

        boolean increasing = isIncreasing(array);
        System.out.println("Is sequence increasing? - " + increasing);
    }

    private static boolean isIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                return false;
            }
        }
        return true;
    }
}


package com.hillel.homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            sum = sum + number;
            input = scanner.nextLine();
        }
        System.out.println("result: " + sum);

    }
}

package com.hillel.homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        int number = scanner.nextInt();
        int result = factorialArray(number);
        System.out.println(number + "! = " + result);
        System.out.println(number + "! = " + factorial(number));

    }

    public static int factorialArray(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }

    public static int factorial(int number){

        if (number == 1) {
            return number;
        }

        return number * factorial(number - 1);
    }
}

package com.hillel.classwork.lasson4;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input p or s operation:");
        String operation = scanner.nextLine();

        System.out.println("input a, b:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + " " + b);

        int result = 0;
        if ("p".equals(operation)) {
            result = RectangleUtils.getPerimeter(a, b);
        } else if ("s".equals(operation)) {
            result = RectangleUtils.getSquare(a, b);
        }
        System.out.println(result);

    }

    public static class RectangleUtils {

        public static int getPerimeter(int a, int b) {
            return (a + b) * 2;
        }

        public static int getSquare(int a, int b) {
            return a * b;
        }
    }


}






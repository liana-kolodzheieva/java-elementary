package com.hillel.homework;

public class Homework3 {
    public static void main(String[] args) {

        Integer num1 = Integer.parseInt(args[0]);
        String sign = args[1];
        Integer num2 = Integer.parseInt(args[2]);

        int result = 0;
        switch (sign) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("неправильный знак");
        }

        System.out.println("result: " + result);

    }
}

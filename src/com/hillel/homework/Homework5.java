package com.hillel.homework;

import java.util.Locale;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.toLowerCase(Locale.ROOT);
        string = string.replace(" ", "");

        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();

        if(string.equals(stringBuilder.toString())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}

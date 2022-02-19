package com.hillel.classwork.lesson1;

import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        int numberVariable = scanner.nextInt();
        if( numberVariable % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("не четное");
        }




}}

package com.hillel.classwork.lesson1;

import java.util.Scanner;

public class Great {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your mark: ");
        int grade = scanner.nextInt();
        if (grade >= 1 && grade <= 3) {
            System.out.println("поздравляю! Ты двоешник) учись лутше:) ");
        }
        if (grade >= 4 && grade <= 6) {
            System.out.println("ты троешник) неплохо но можешь лутше)");
        }
        if (grade >= 7 && grade <= 9) {
            System.out.println("ты хорошист молодец ");
        }
        if (grade >= 10 && grade <= 12) {
            System.out.println("ты отличник молодец иди в политех");

        }
        if (grade >= -26 && grade <= 0 ) {
            System.out.println("ОШИБКА! ВЕДИЕ ОЦЕНКУ");
        }
        if (grade >= 26 && grade <= 13 ) {
            System.out.println("ОШИБКА! ВЕДИЕ ОЦЕНКУ");
        }
    }

}


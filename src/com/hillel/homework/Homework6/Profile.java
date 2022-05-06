package com.hillel.homework.Homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Profile{

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(5);
        while (persons.size() != 5) {
            Person person = createPerson();
            if (person != null) {
                persons.add(person);
            }
        }

        if (persons.get(2).equals(persons.get(4))) {
            System.out.println("Пользователи одинаковые");

        }else
            System.out.println("пользователи не одинаковые");

    }

    private static Person createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String firstName = scanner.nextLine();
        System.out.println("Введите фвмилию: ");
        String lastName = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Введите пароль еще раз: ");
        String password2 = scanner.nextLine();
        System.out.println(password.equals(password2));
        if (password.equals(password2)) {
            System.out.println("Вы вошли в сестему");
        } else {
            System.out.println("Нe правильный пароль");
            return null;
        }

        return new Person(firstName, lastName, password);
    }


}




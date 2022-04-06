package com.hillel.homework.homework8;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write your name: ");
        String name = scanner.nextLine();
        Person person = new Person(name);
        System.out.println("write your password: ");
        String password = scanner.nextLine();
        Person.Account account = person.new Account(password);
        account.displayAccount();

    }

}

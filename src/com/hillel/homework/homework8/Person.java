package com.hillel.homework.homework8;

public class Person {
    String name;
    public Person(String name){
        this.name = name;

    }

    public class Account {
        String password;
        public Account(String password){
            this.password = password;
        }
        public void displayAccount(){
            System.out.print("your name: ");
            System.out.println(name);
            System.out.print("your password: ");
            System.out.println(password);
        }


    }

}

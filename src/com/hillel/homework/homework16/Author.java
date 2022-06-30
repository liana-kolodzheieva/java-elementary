package com.hillel.homework.homework16;

import java.util.ArrayList;

public class Author {
    private String surname;
    private String name;
    private ArrayList<Book> books;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
        this.books = new ArrayList<>();
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void printAuthor() {
        System.out.println(this);
    }

    public void printAuthorBooks() {
        System.out.println(this + " Books: " + this.getBooks());
    }
}

package com.hillel.homework.homework16;

public class Book {
    private String name;
    private String description;
    private int year;
    private Genre genre;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }

    public void printBook() {
        System.out.println(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Book(String name, String description, int year, Genre genre) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public Genre getGenre() {
        return genre;
    }
}

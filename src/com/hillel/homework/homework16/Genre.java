package com.hillel.homework.homework16;

public class Genre {
    private String name;
    private String description;

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void printGenre() {
        System.out.println(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

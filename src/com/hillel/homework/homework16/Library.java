package com.hillel.homework.homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library {
    public static ArrayList<Author> AUTHORS = new ArrayList<>();
    public static ArrayList<Genre> GENRES = new ArrayList<>();
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Library library = new Library();

        do {
            System.out.println("Choose object: BOOK, AUTHOR or GENRE. After choose action: ADD, DELETE or PRINT.");
            try {
                library.chooseObject(ObjectType.valueOf(READER.readLine().toUpperCase()),
                        Action.valueOf(READER.readLine().toUpperCase()));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!(READER.readLine()).equals("exit"));
    }

    public static void createAuthor() throws IOException {
        System.out.println("Input author's name: ");
        String name = READER.readLine();
        System.out.println("Input author's surname: ");
        String surname = READER.readLine();
        Author author = new Author(name, surname);
        AUTHORS.add(author);
    }

    public static void createGenre() throws IOException {
        System.out.println("Input genre name: ");
        String name = READER.readLine();
        System.out.println("Input genre description: ");
        String description = READER.readLine();
        Genre genre = new Genre(name, description);
        GENRES.add(genre);
    }

    public static void createBook() throws IOException {
        System.out.println("Input book's name: ");
        String name = READER.readLine();
        System.out.println("Input genre description: ");
        String description = READER.readLine();
        System.out.println("Input book's year: ");
        int year = Integer.parseInt(READER.readLine());
        System.out.println("Input book's genre: ");
        Book book = new Book(name, description, year, chooseGenre());
        chooseAuthor().getBooks().add(book);
    }

    public static Genre chooseGenre() throws IOException {
        if (GENRES.isEmpty()) {
            System.out.println("Genre list is empty, please create genre :>");
            createGenre();
        }
        System.out.println("Choose genre: ");
        for (int i = 0; i < GENRES.size(); i++) {
            System.out.println("[" + i + "] " + GENRES.get(i));
        }
        int input = Integer.parseInt(READER.readLine());
        if (input > GENRES.size() || input < 0) {
            return chooseGenre();
        }
        return GENRES.get(input);
    }

    public static Author chooseAuthor() throws IOException {
        if (AUTHORS.isEmpty()) {
            System.out.println("Author list is empty, please create author :>");
            createAuthor();
        }
        System.out.println("Choose author: ");
        for (int i = 0; i < AUTHORS.size(); i++) {
            System.out.println("[" + i + "] " + AUTHORS.get(i));
        }
        int input = Integer.parseInt(READER.readLine());
        if (input > AUTHORS.size() || input < 0) {
            return chooseAuthor();
        }
        return AUTHORS.get(input);
    }

    public ArrayList<Genre> deleteGenre() throws IOException {
        if (GENRES.size() == 0) {
            System.out.println("No genres created!");
        }
        System.out.println("What genre do you want to delete?");
        for (int i = 0; i < GENRES.size(); i++) {
            System.out.println("[" + i + "] -" + GENRES.get(i));
        }
        int input = Integer.parseInt(READER.readLine());
        if (input < 0 || input >= GENRES.size()) {
            return deleteGenre();
        }
        GENRES.remove(input);
        return GENRES;
    }

    public static void deleteBook() throws IOException {
        System.out.println("What book do you want to delete? Input name:");
        String input = READER.readLine();
        for (Author author : AUTHORS) {
            if (getBookIndex(author, input) != -1) {
                author.getBooks().remove(getBookIndex(author, input));
            }
        }
    }

    public static int getBookIndex(Author author, String input) {
        int numberBook = 0;
        for (Book book : author.getBooks()) {
            if (book.getName().equals(input)) {
                numberBook = author.getBooks().indexOf(book);
                return numberBook;
            }
        }
        return -1;
    }


    public ArrayList<Author> deleteAuthor() throws IOException {
        if (AUTHORS.size() == 0) {
            System.out.println("No authores created!");
        }
        System.out.println("What author do you want to delete?");
        for (int i = 0; i < AUTHORS.size(); i++) {
            System.out.println("[" + i + "] -" + AUTHORS.get(i));
        }
        int input = Integer.parseInt(READER.readLine());
        if (input < 0 || input >= AUTHORS.size()) {
            return deleteAuthor();
        }
        AUTHORS.remove(input);
        return AUTHORS;
    }

    public void chooseObject(ObjectType objectType, Action action) throws IOException {

        switch (objectType) {
            case AUTHOR:
                chooseAuthorAction(action);
                break;
            case GENRE:
                chooseGenreAction(action);
                break;
            case BOOK:
                chooseBookAction(action);
                break;
        }
    }

    public void chooseAuthorAction(Action action) throws IOException {
        switch (action) {
            case ADD:
                createAuthor();
                break;
            case DELETE:
                deleteAuthor();
                break;
            case PRINT:
                if (AUTHORS.size() == 0) {
                    System.out.println("The list is empty!");
                }
                for (Author author : AUTHORS) {
                    author.printAuthor();
                }
                break;
        }

    }

    public void chooseGenreAction(Action action) throws IOException {

        switch (action) {
            case ADD:
                createGenre();
                break;
            case DELETE:
                deleteGenre();
                break;
            case PRINT:
                if (GENRES.size() == 0) {
                    System.out.println("The list is empty!");
                }
                for (Genre genre : GENRES) {
                    genre.printGenre();
                }
                break;
        }
    }

    public void chooseBookAction(Action action) throws IOException {

        switch (action) {
            case ADD:
                createBook();
                break;
            case DELETE:
                deleteBook();
                break;
            case PRINT:
                if (AUTHORS.size() == 0) {
                    System.out.println("The list is empty!");
                }
                for (Author author : AUTHORS) {
                    author.printAuthorBooks();
                }
                break;
        }
    }
}

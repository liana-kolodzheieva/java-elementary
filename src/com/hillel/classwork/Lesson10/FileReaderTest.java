package com.hillel.classwork.Lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\liana\\Hallo.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        }
    }


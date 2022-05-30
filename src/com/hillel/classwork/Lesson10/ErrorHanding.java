package com.hillel.classwork.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ErrorHanding {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        System.out.println(readLine());

    }


    public static String readLine() throws IOException {
        System.out.println("input string ");
        try {
            return READER.readLine();
        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
            return readLine();
        }
    }
    public static int readNumber() throws IOException {
        System.out.println("input number ");
        try {
            return Integer.parseInt(READER.readLine());
        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
            return readNumber();



        }
    }




}

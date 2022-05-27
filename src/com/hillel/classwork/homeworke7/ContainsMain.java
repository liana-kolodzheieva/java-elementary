package com.hillel.classwork.homeworke7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ContainsMain {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        String input;
        System.out.println("Write words and when you finis write 'stop' ");
        while (!(input = bufferedReader.readLine()).equals("stop")) {
            words.add(input);

        }
        if (words.contains("war")) {
            System.out.println("!forbidden word found!");

        }
        if (words.contains("rusia")) {
            System.out.println("!forbidden word found!");

        }
        int count = 0;
        for (String word : words) {
            if (word.equals("war")) {
                count++;
            }

            int count1 = 0;
            for (String word1 : words) {
                if (word.equals("rusia")) {
                    count++;

                }
                int forbidden = count + count;
                System.out.println("number of forbidden words:" + forbidden);
            }
        }
    }
}



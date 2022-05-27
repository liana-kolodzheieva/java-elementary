package com.hillel.classwork.homeworke7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateMain {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        System.out.println("create array: " + Arrays.toString(new List[]{number}));
        System.out.println("ready array: ");
        for (int i = 1; i <= 10; i++) {
            number.add(i);
        }
        System.out.println(" " + number);


        for (int i = 0; i < number.size(); i++) {
            int j = number.size() - i - 1;
            System.out.println(number.get(j) + " ");
        }

        for (Integer wholeNumber : number) {
            System.out.println(wholeNumber + " ");
        }

        System.out.println("does 7 exist in collection? " + number.contains(7));
        System.out.println("does 20 exist in collection? " + number.contains(20));

    }


}

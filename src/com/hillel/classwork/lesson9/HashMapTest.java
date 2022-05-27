package com.hillel.classwork.lesson9;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {


        Set<String> deportaments = new HashSet<>();
        deportaments.add("HR");
        deportaments.add("Dew");
        deportaments.add("MANGEMEND");
        for (String department : deportaments){
            System.out.println(deportaments);
        }
        if (deportaments.contains("Dew")){

        }else {
            System.out.println("There are no developers in company");
        }

    }


}

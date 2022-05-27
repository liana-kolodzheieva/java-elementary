package com.hillel.classwork.lesson9;

import java.util.Comparator;

public class BirdComparator implements Comparator <Bird> {
    public int compare(Bird o1, Bird o2){
        //Comparator.reverseOrder().compare(o1.getColor(), o2.getColor());
        return o1.getColor().compareTo(o2.getColor());


}}

package com.hillel.homework.homework15;

public class ArrayMain {
    public static void main(String[] args) {

        MyArrayList arrayList = new MyArrayList();

        arrayList.add("str");
        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");
        arrayList.add("str4");
        arrayList.add("str5");
        arrayList.add("str6");
        arrayList.add("str7");
        arrayList.add(8, "str8");
        arrayList.add(6, "str9");
        arrayList.add(2, "str10");

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.remove(14);
        arrayList.remove(10);
        arrayList.remove("str");
        arrayList.remove("str8");

        System.out.println(arrayList.contains("str"));

        System.out.println(arrayList);


        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.isEmpty());

        System.out.println(arrayList);


        MyArrayList arr = new MyArrayList();

        arr.add("text2");

        arr.add(0, "text");
        arr.add(1, "text1");

        System.out.println(arr);

        arr.remove(0);
        arr.set(0, "test 2");

        System.out.println(arr);

        System.out.println(arr.get(1));
        System.out.println(arr.get(50));


    }
}

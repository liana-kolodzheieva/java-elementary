package com.hillel.homework.homework15;

public class MyArrayList {
    private int size;
    private String[] strings = new String[size];


    public MyArrayList() {
    }

    public MyArrayList(int size) {
        strings = new String[size];
        this.size = size;
    }

    public String get(int index) {
        try {
            return strings[index];
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage() + " / Return statement = null");
            return null;
        }
    }

    public void set(int index, String string) {
        if (indexOutBounds(index)) return;
        strings[index] = string;
    }

    public void remove(int indexRemove) {
        try {
            System.arraycopy(strings, indexRemove + 1, strings, indexRemove, size - 1 - indexRemove);
            size--;
            System.out.println("String is removed");
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void remove(String string) {
        int indexRemove = indexOf(string);
        remove(indexRemove);
    }

    private int indexOf(String string) {
        for (int i = 0; i < size; i++) {
            if (string.equals(strings[i])) {
                return i;
            }
        }
        return -1;
    }

    public void add(String string) {
        size++;
        if (size >= strings.length) grow();
        strings[size-1] = string;

    }

    private void grow() {
        String[] stringsNew;
        if (strings.length == 0) {
            stringsNew = new String[10];
        } else {
            stringsNew = new String[strings.length * 2];
        }
        System.arraycopy(strings, 0, stringsNew, 0, strings.length);
        strings = stringsNew;

    }

    public boolean add(int indexPaste, String stringr) {
        if (indexOutBounds(indexPaste)) {
            return false;
        }
        add("0");
        if (size - 1 - indexPaste >= 0)
            System.arraycopy(strings, indexPaste, strings, indexPaste + 1, size - 1 - indexPaste);

        strings[indexPaste] = stringr;
        return true;
    }

    private boolean indexOutBounds(int index) {
        return index > strings.length - 1 || index < 0;
    }

    @Override
    public String toString() {
        if (strings == null)
            return "null";
        StringBuilder string = new StringBuilder();
        string.append('[');
        for (int i = 0; i < size; i++) {
            string.append(strings[i]);
            if (i == size - 1)
                return string.append(']').toString();
            string.append(", ");
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(String string) {
        return indexOf(string) >= 0;
    }}

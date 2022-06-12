package com.hillel.classwork.lesson11;

public class MultiTreading {
    public static void main(String[] args) {
        System.out.println("thread: " + Thread.currentThread().getName());
        Printer printer = new Printer();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Printer());
            thread.start();
        }
        System.out.println("thread: " + Thread.currentThread().getName());
    }

    public static class Printer implements Runnable {
        private String name;
        public Printer(){
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("thread: " + Thread.currentThread().getName());
            System.out.println("Print message from ");

        }
    }
}

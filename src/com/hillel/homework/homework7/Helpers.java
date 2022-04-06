package com.hillel.homework.homework7;

public class Helpers {
    public static class DistanceHelper {
        public static double calculateDistance(int x1, int x2, int y1, int y2) {
            return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        }
        public static int MathHelper(int a, int b){
            return a + b;
            }
        }
    }


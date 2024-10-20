package ru.job4j.condition;

public class Vector {
    public static String addVectors(int x1, int y1, int x2, int y2) {
        int xResult = x1 + x2;
        int yResult = y1 + y2;
        return String.format("(%d, %d)", xResult, yResult);
    }

    public static void main(String[] args) {
        String result = addVectors(6, 4, 2, 1);
        System.out.println("result (6, 4) + (2, 1) = " + result);
    }
}

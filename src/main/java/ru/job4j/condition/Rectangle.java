package ru.job4j.condition;

public class Rectangle {
    public static double diagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public static void main(String[] args) {
        double result = diagonal(3, 4);
        System.out.println(result);
    }
}

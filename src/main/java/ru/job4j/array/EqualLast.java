package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        int lastLeft = left[left.length - 1];
        int lastRight = right[right.length - 1];
        return lastLeft == lastRight;
    }
}


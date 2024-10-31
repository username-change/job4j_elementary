package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        if (array.length < 2) {
            return new int[0];
        }

        int pointerOne = 0;
        int pointerTwo = array.length - 1;

        while (pointerOne < pointerTwo) {
            int sum = array[pointerOne] + array[pointerTwo];

            if (sum == target) {
                return new int[]{pointerOne, pointerTwo};
            } else if (sum < target) {
                pointerOne++;
            } else {
                pointerTwo--;
            }
        }

        return new int[0];
    }
}

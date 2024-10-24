package ru.job4j.array;

import java.util.Arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp1 = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp1;
                    isSorted = false;
                }
            }

            for (int index = 0; index < array.length; index++) {
                System.out.println(array[index]);
            }
        }
    }
}

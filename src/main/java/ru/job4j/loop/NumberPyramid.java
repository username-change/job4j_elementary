package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int m = i - 1; m >= 1; m--) {
                System.out.print(m);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(4);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}

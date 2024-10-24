package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        if (prefix.length > word.length) {
            return false;
        }

        for (int i = 0; i < prefix.length; i++) {
            if (word[i] != prefix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

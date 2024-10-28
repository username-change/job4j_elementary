package ru.job4j.array;

public class MatrixCheck {
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}



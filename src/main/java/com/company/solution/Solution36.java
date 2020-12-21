package com.company.solution;

/**
 * 36. 有效的数独
 * TODO:其他解法
 */
public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        // 记录某行，某位数字是否已经被摆放
        boolean[][] row = new boolean[9][9];
        // 记录某列，某位数字是否已经被摆放
        boolean[][] col = new boolean[9][9];
        // 记录某 3x3 宫格内，某位数字是否已经被摆放
        boolean[][] block = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int blockIndex = i / 3 * 3 + j / 3;
                    if (row[i][num] || col[j][num] || block[blockIndex][num]) {
                        return false;
                    } else {
                        row[i][num] = true;
                        col[j][num] = true;
                        block[blockIndex][num] = true;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku2(char[][] board) {
        boolean[][] boxValues = new boolean[9][9];
        boolean[] rowValues;
        boolean[] ColValues;
        for (int row = 0; row < 9; row++) {
            rowValues = new boolean[9];
            ColValues = new boolean[9];
            for (int col = 0; col < 9; col++) {
                char rowChar = board[row][col];
                if (rowChar != '.') {
                    int rowValue = rowChar - '1';
                    if (rowValues[rowValue]) {
                        return false;
                    } else {
                        rowValues[rowValue] = true;
                    }

                    int boxIndex = col / 3 * 3 + row / 3;
                    if (boxValues[boxIndex][rowValue]) {
                        return false;
                    } else {
                        boxValues[boxIndex][rowValue] = true;
                    }
                }

                char colChar = board[col][row];
                if (colChar != '.') {
                    int colValue = colChar - '1';
                    if (ColValues[colValue]) {
                        return false;
                    } else {
                        ColValues[colValue] = true;
                    }
                }
            }
        }
        return true;
    }
}

package com.company.Interview;

/**
 * 面试题 01.07. 旋转矩阵
 */
public class Interview0107 {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        int[][] temp = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[j][N - i - 1] = matrix[i][j];
            }
        }
        // 遍历将推演结果拷贝回原数组。
        for (int i = 0; i < N; i++) {
            System.arraycopy(temp[i], 0, matrix[i], 0, N);
        }
    }
}

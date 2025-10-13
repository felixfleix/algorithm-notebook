package com.felix.leetcode;

/**
 * 867. 转置矩阵
 *
 * @author felix
 */
public class _867 {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        // 原矩阵行变列，列变行，设置新矩阵大小
        int[][] result = new int[column][row];
        // 取原矩阵第一行，放入新矩阵第一列，依次类推
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}

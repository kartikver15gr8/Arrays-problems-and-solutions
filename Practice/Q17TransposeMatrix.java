package com.Arrays.Practice;

import java.util.Arrays;

public class Q17TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] ans = transpose(matrix);
        System.out.println(ans);

    }

    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[i][j] = matrix[j][i];
            }
            System.out.println(Arrays.toString(ans[i]));
        }
        return ans;
    }
}

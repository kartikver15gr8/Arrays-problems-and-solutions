package com.Arrays.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        int[][] ans = transposeMatrix(arr);
        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
//        int[] arr = {-4, -3, -2, -1, 4, 3, 2};
//        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int[] diff = new int[gain.length];
        for (int i = 1; i < gain.length; i++) {
            diff[i] = diff[i - 1] + gain[i - 1];
        }
        int max = diff[0];
        for (int i = 0; i < diff.length; i++) {
            if (diff[i] > max) {
                max = diff[i];
            }
        }
        return max;
    }

    static int[][] transposeMatrix(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        int[][] ans = new int[a][b];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                ans[row][col] = arr[col][row];
            }
        }
        return ans;
    }


}

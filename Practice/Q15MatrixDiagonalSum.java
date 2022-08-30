package com.Arrays.Practice;

import java.util.Arrays;

public class Q15MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int ans = diagonalSum(mat);
    }

    static int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int i=0,j=0;
        while(i<n)
        {
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while(i<n)
        {
            if(i!=j)   sum+=mat[i][j];

            i++;
            j--;
        }return sum;
    }
}

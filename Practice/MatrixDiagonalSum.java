package com.Arrays.Practice;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int para = mat[0].length-1;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){
                if(row==col){
                    sum+=mat[row][col];
                }
                if(row+col==para){
                    sum+=mat[row][col];
                }
            }
        }
        if(para%2==0){
            return sum-mat[para/2][para/2];
        }
        return sum;
    }
}

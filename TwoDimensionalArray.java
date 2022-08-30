package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        1 2 3
        4 5 6
        7 8 9
    */
        int[][] sqMatrix = new int[3][3];

        for (int row = 0; row < sqMatrix.length; row++) {
            for (int col = 0; col < sqMatrix[row].length; col++) {
                sqMatrix[row][col] = in.nextInt();
            }
            System.out.println(Arrays.toString(sqMatrix[row]));
        }

        // The below is a 2d array with unequal number of elements in row, or we can say having different number of columns

        int[][] arr = {
                {0,0,0,0},
                {0,0,0},
                {0,0}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
            System.out.println(Arrays.toString(arr[row]));
        }

    }

}

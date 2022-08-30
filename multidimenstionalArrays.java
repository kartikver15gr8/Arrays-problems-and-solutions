package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multidimenstionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Suppose you want to make such array that
        * can store a matrix or something like that,
        * in that types of scenarios multiDimensional
        * arrays came into play */

        //Suppose you want to store elements as below
        /*
        *   1 2 3
        *   4 5 6
        *   7 8 9
        * We can store it as below*/

//        int[][] arr = new int[3][3]; // Here I defined an array which is like 3*3 matrix

        int[][] arr2d = { // This is another 2d array of order 3*3
                {1, 2, 5},  // 0th index
                {4, 5},     // 1st index
                {78, 459, 6, 6}   // 2nd index
        };
        System.out.println(Arrays.toString(arr2d[2]));


         // Input

        int[][] arr = new int[3][3];
//        System.out.println(arr.length); // In case of 2d array this will return no. of rows

        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Output the 2d-Array

//        for (int row = 0; row < arr.length; row++) {
//            // for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//        }

        // An efficient way to print the 2d-array using 'toString' method
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }



    }
}

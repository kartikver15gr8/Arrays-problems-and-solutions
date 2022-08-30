package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements in the 2d-array");
        int[][] arr =new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        // The below is a 2d-array of characters:

//        char[][] charArray = {
//                {'a','b','c'},
//                {'e','r','d','w'},
//                {'t','e'}
//        };
//
//        for (char[] chars : charArray) {
//            System.out.println(Arrays.toString(chars));
//        }




    }
}

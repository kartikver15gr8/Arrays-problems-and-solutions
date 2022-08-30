package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapWholeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[arr.length - i-1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}

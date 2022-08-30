package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5]; // Declaration and initialization of array
        // Array Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // Array Output
        System.out.print(Arrays.toString(arr));

        String[] Str = new String[5];
        // Array Input
        for (int i = 0; i < Str.length; i++) {
            Str[i] = in.next();
        }
        System.out.println(Arrays.toString(Str));


    }
}




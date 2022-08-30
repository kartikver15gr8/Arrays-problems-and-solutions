package com.Arrays;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] number = {12, 5, 48, 8};
        System.out.println(Arrays.toString(number));
        change(number);
        System.out.println(Arrays.toString(number));
    }


    static void change(int[] arr) {
        arr[0] = 89;
    }
}

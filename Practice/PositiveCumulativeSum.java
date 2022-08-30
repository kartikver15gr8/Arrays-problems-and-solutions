package com.Arrays.Practice;

import java.util.ArrayList;

public class PositiveCumulativeSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        ArrayList<Integer> ans = getPositiveCumulativeSum(arr);
        System.out.println(ans);
    }

    static ArrayList<Integer> getPositiveCumulativeSum(int[] arr) {
        ArrayList<Integer> positiveCumSum = new ArrayList<>();
        int sum = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
            if (arr[i] > 0) {
                positiveCumSum.add(j, arr[i]);
                j++;
            }
        }return positiveCumSum;
    }
}

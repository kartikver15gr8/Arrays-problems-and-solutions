package com.Arrays.Practice;

import java.util.Arrays;

public class Q1BuildingArrayFromPermutation {
    public static void main(String[] args) {
        int[] h = {5, 0, 1, 2, 3, 4};
        int[] arr = buildArray(h);
        System.out.println(Arrays.toString(arr));
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }return ans;
    }
}

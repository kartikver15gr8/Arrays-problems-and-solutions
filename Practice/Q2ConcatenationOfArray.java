package com.Arrays.Practice;

import java.util.Arrays;

public class Q2ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] myAns = Concatenate(nums);
        System.out.println(Arrays.toString(myAns));
    }

    static int[] Concatenate(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }return ans;
    }
}

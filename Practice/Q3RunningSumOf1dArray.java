package com.Arrays.Practice;

import java.util.Arrays;

public class Q3RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myAns = RunningSum(nums);
        System.out.println(Arrays.toString(myAns));

    }

    static int[] RunningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }return ans;
    }
}

package com.Arrays.Practice;

import java.util.Arrays;

public class Q8HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] arr = maxCount(nums);
        System.out.println(Arrays.toString(arr));
    }

    static int[] maxCount(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int max = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }ans[i] = count;
            }
        }return ans;
    }
}

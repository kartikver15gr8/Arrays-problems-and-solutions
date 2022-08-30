package com.Arrays.Practice;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 8};
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count += 1;
                }
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));

    }
}

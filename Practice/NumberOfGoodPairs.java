package com.Arrays.Practice;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]) {
                    count += 1;
                }
            }
        }
        System.out.println(count);

    }
}

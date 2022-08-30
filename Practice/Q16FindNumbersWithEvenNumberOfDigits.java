package com.Arrays.Practice;

public class Q16FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {437, 315, 322, 431, 686, 264, 442};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                even++;
            }
            count=0;
        }
        return even;
    }

}

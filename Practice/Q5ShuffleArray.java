package com.Arrays.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q5ShuffleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] myAns = shuffleArray(nums,n);
        System.out.println(Arrays.toString(myAns));
    }

    static int[] shuffleArray(int[] nums,int n) {
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            ans[i] = nums[j];
            ans[i + 1] = nums[n + j];
            j++;
        }return ans;
    }
}

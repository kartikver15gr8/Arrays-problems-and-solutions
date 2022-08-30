package com.Arrays.Practice;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 78};
        int n = 2;
        int[] ans = shuffle(input, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0; i<2*n; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }
        return ans;
    }
}

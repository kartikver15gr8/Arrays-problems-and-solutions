package com.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practiceWithMe {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 1, 2};
        int n = 1;
//        int[] ans = practice(arr, n);
        boolean[] ans = practice(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    static boolean[] practice(int[] candies, int extraCandies) {
        boolean[] ans = new boolean[candies.length];
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= max) {
                ans[i] = true;
            }
        }
        return ans;
    }
}

package com.Arrays.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q6KidsWithMaxCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] Candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        boolean[] arr = maxCandies(Candies, extraCandies);
        System.out.println(Arrays.toString(arr));
    }

    static boolean[] maxCandies(int[] Candies, int extraCandies) {
        boolean[] ans = new boolean[Candies.length];
        int max = 0;
        for (int i = 0; i < Candies.length; i++) {
            if (Candies[i] > max) {
                max = Candies[i];
            }
        }
        for (int i = 0; i < Candies.length; i++) {
            if (Candies[i] + extraCandies >= max) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }return ans;
    }
}


package com.Arrays.Practice;

import java.util.Arrays;
import java.util.List;

public class Q18AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int[] ans = addToArrayForm(num);
        System.out.println(Arrays.toString(ans));
    }

    static int[] addToArrayForm(int[] num) {
        int[] ans = new int[num.length];
        int k = 34;
        int number = num[0];
        for (int i = 0; i < num.length - 1; i++) {
            number *= 10;
            number += num[i + 1];
        }
        System.out.println(number);
        number += k;
        for (int i = ans.length - 1; i >= 0; i--) {
            int rem = number % 10;
            ans[i] = rem;
            number /= 10;
        }return ans;
    }

}

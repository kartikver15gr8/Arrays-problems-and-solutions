package com.Arrays.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Q9CreateTargetArrayOfGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] ind = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ind));

    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>(index.length);
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}

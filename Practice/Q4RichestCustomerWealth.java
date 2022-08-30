package com.Arrays.Practice;

public class Q4RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,5,3},
                {3,2,1,4}
        };
        int ans = maxWealth(accounts);
        System.out.println(ans);
    }

    static int maxWealth(int[][] accounts) {
        int max =0;
        for (int i = 0; i < accounts[0].length; i++) {
            max+=accounts[0][i];
        }
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }

        }return max;
    }
}

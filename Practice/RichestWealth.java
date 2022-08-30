package com.Arrays.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class RichestWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wealth = -1;
        int[][] accounts = new int[2][3];
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                accounts[row][col] = in.nextInt();
            }
            System.out.println(Arrays.toString(accounts[row]));
        }
        for (int row = 0; row < accounts.length; row++) {
            int max = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                max += accounts[row][col];
            }
            if (max > wealth) {
                wealth = max;
            }
        }
        System.out.println(wealth);

    }
}

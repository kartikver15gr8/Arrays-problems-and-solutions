package com.Arrays;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int x = in.nextInt();
        System.out.println(reverseInteger(x));
    }

    static long reverseInteger(int x) {
        long result = 0;
        if (x == 0) {
            return x;
        } else if (x > 0 &&x < 2147483647) {
            while (x > 0) {
                int rem = x % 10;
                result = result * 10 + rem;
                x /= 10;
            }
        } else {
            while (x < 0 && x > -2147483647) {
                int rem = x % 10;
                result = result * 10 + rem;
                x /= 10;
            }
        }
        return result;
    }

//    public int reverse(int x) {
//        boolean isNegative = false;
//        if (x < 0) {
//            isNegative = true;
//            x = -x;
//        }
//        long reverse = 0;
//        while (x > 0) {
//            reverse = reverse * 10 + x % 10;
//            x /= 10;
//        }
//        if (reverse > Integer.MAX_VALUE) {
//            return 0;
//        }
//        return (int) (isNegative ? -reverse : reverse);
}

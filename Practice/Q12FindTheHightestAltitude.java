package com.Arrays.Practice;

import java.util.Arrays;

public class Q12FindTheHightestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        int ans = highestAltitude(gain);
        System.out.println(ans);
    }

    static int highestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        int j = 1;
        for (int i = 0; i < gain.length; i++) {
            altitude[j] = altitude[j - 1] + gain[i];
            j++;
        }
        System.out.println(Arrays.toString(altitude));
        int max = altitude[0];
        for (int i = 0; i < altitude.length; i++) {
            if (altitude[i] >= max) {
                max = altitude[i];
            }
        }return max;
    }
}

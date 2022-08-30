package com.Arrays.Practice;

import java.util.Arrays;

public class Q13FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = new int[3][];
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.toString(ans));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        // for flipping each array horizontally(Reversing Array)
        for (int i = 0; i < image.length; i++) {
            int k = image.length-1;
            for (int j = 0; j < image[i].length/2; j++) {
                int temp = image[i][k-j];
                image[i][k-j] = image[i][j];
                image[i][j] = temp;
            }

        }
        // Inverting elements
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else if (image[i][j] == 1) {
                    image[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(image[i]));

        }return image;
    }
}

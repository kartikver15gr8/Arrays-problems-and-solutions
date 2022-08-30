package com.Arrays.Practice;

import java.util.Arrays;

public class SwapingValuesInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The Array before swapping is:");
        System.out.println(Arrays.toString(myArray));
        Swap(myArray, 3, 5);
        System.out.println("The Array after swapping is:");
        System.out.println(Arrays.toString(myArray));
    }

    static void Swap(int[] myArray, int index1, int index2) {
        int temp = myArray[index1];
        myArray[index1] = myArray[index2];
        myArray[index2] = temp;
    }
}

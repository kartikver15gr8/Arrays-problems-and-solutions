package com.Arrays.Practice;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The array before reversing is: "+Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("The array after reversing is: "+Arrays.toString(myArray));
    }

    static void reverse(int[] myArray) {
        int start = 0;
        int end = myArray.length - 1;
        while (start < end) {
            // Swap
            Swap(myArray, start, end);
            start++;
            end--;
        }
    }
    static void Swap(int[] myArray, int index1, int index2) {
        int temp = myArray[index1];
        myArray[index1] = myArray[index2];
        myArray[index2] = temp;
    }
}

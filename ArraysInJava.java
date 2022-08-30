package com.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
       /* We use array whenever we want to
       * store same datatype together.
       * So we can say that arrays are the
       * collection of elements of same datatype.*/

        // Syntax
        // datatype[] variable_name = new datatype[size];

        // store five roll numbers:
        int[] roll_no = new int[5];

        // Declaring array directly
        int[] numbers = {1, 5, 4, 7, 8};

        int[] arr; // Declaration of array. "arr" is getting defined in the stack.
        arr = new int[5]; // Initialisation: Actually here object is being created in the memory(heap).
        System.out.println(arr[2]);

        String[] str = new String[4];
        System.out.println(str[0]);

    }


}

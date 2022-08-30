package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {


        /*The below is array of primitive datatype
        * and primitive datatype are those which cannot be
        * broken down further into smaller or simpler datatypes
        * for e.g: int, float, double, long, char, etc*/

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
/*
        arr[0] = 21;
        arr[1] = 121;
        arr[2] = 221;
        arr[3] = 215;
        arr[4] = 211;
        // [21,121,221,215,211]
        System.out.println(arr[4]);

        // input using for loops
        /* Below we used a for loop to take inputs from
        * user and store them in the array* /

*/
        System.out.println("Hello");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The array is:");
        System.out.println(Arrays.toString(arr));



        /*Here we used the loop to print each element
        * which was stored in array using above loop.
        * we are printing each element of the array by
        * using the index of each element*/

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        /*The below for loop is used to print each element
        * of array, In the loop we initialized the integer 'a'
        * as an element of array 'arr' and then we used the print
        * command in the loop body to print each element*/

        for (int a : arr) { // Here we are printing each element in the array 'arr'
            System.out.print(a + " ");  // 'a' represents each element in the array.
        }



        /* The below is the array of objects*/

        String[] str = new String[4];
        System.out.println("Enter the elements of array:");
        for (int element = 0; element < str.length; element++) {
            str[element] = in.next();
        }
        System.out.println("The array of string datatype is:");
        System.out.println(Arrays.toString(str));

        // Modifying the elements of array
        str[0] = "Kunal Kushwaha";
        str[1] = "Kartikey Verma";
        System.out.println(Arrays.toString(str));
    }

}

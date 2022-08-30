package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInJava {
    public static void main(String[] args) {

        /*So firstly a question may arise that
        * why do we need an array-list, So we all know
        * that if we want to input elements in an array
        * we have to declare the row and column size as well
        * but just suppose we want to input elements in array in such
        * manner that the number of elements in each row is not same
        * or they may differ.
        *
        * for e.g:
        *   int[][] arr = {
        *           {1,2,5,4,7},
        *           {1,5},
        *           {1,5,75,7}
        *       }
        *
        * So to input any desired number of elements in each row
        * the concept of Array-List came into play.
        * So we may say that, An Array-List facilitates us to
        * input random number of elements(of same datatype) in rows
        * of array.*/

        /* Syntax
        * ArrayList<Integer> list = new ArrayList<>();
        * */
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(5);     // Here we are adding integer elements in the arraylist
//        list.add(51);
//        list.add(45);
//        list.add(55);
//        list.add(75);
//        System.out.println(list);
//        System.out.println(list.contains(51));      // This will return a boolean "true" if list contains the "51" and "false" if the list do not contain "51"
//        list.set(0, 97);        // This will change the element which is at zeroth index to "97"
//        System.out.println(list);
//        list.remove(1);    // This will remove the element at 1st index
//        System.out.println(list);



        // Input in an ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Output the ArrayList
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");        // This will print the element present at ith index
        }





    }
}

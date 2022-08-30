package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
/*
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(5);
        System.out.println(list);
*/
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());


        }
        System.out.println(list);
        list.set(4, 100);   // Update 4th index of the list to 100
        System.out.println(list);

    }
}

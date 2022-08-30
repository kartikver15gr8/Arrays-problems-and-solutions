package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensioanlArrayListInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // To create a Multi Dimensional ArrayList we create an ArrayList inside an ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}

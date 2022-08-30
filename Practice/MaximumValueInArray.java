package com.Arrays.Practice;

public class MaximumValueInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 56, 6, 7, 8, 97};
        System.out.println("The Greatest element in the array is: " + max(myArray));


//        int a = maxInRange(myArray, 2, 5);
//        System.out.println(a);
    }

    static int max(int[] myArray) {
        int maxElement = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxElement) {
                maxElement = myArray[i];
            }
        }
        return maxElement;
    }

    // The below function will return the Greatest element in the array in between a range


//    static int maxInRange(int[] myArray,int index1, int index2) {
//    int maxElement = myArray[index1];
//    for (int i = index1; i <= myArray[index2]; i++) {
//        if (myArray[i] > maxElement) {
//            maxElement = myArray[i];
//        }
//    }
//    return maxElement;
//}
}

package com.Arrays.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkPangram(str);
        System.out.println(ans);
    }

    static boolean checkPangram(String str) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    }




}

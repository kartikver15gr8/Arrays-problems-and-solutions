package com.Arrays.Practice;

import java.util.ArrayList;

public class Q11CountItemsMatchingARule {
    public static void main(String[] args) {
//        ArrayList<ArrayList<String>> items = new ArrayList<>();
        String[][] items = {
                {"phone","blue","pixel"},
                {"computer","silver","phone"},
                {"phone","gold","iphone"}
        };
        String ruleKey = "type";
        String ruleValue = "phone";
        int ans = countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);
    }

    static int countMatches(String[][] items, String rulekey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                if (items[i][j] == ruleValue) {
                    count++;
                }
            }
        }return count;
    }
}

package com.practice.DayThree.Practice;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string::");
        String str1 = input.nextLine();
        System.out.println("Enter the second string");
        String str2 = input.nextLine();
        System.out.println(longestCommonSubstring(str1,str2));
    }

    public static String longestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        int maxLength = 0;
        int endPos = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endPos = i - 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return s1.substring(endPos - maxLength + 1, endPos + 1);
    }
}

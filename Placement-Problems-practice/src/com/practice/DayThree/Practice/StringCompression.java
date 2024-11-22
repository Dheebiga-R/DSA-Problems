package com.practice.DayThree.Practice;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.next();

        int count = 1;
        StringBuilder ans = new StringBuilder();
        for(int i=1;i<=str.length();i++){
            if(i<str.length()&&str.charAt(i-1)==str.charAt(i)){
                count++;
            }else{
                ans.append(str.charAt(i-1));
                ans.append(count);
                count=1;
            }
        }
        System.out.println(ans);
        //Time complexity:O(N)
        //Space complexity:O(N)
    }
}

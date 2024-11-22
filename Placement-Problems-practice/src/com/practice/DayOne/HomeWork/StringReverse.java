package com.practice.DayOne.HomeWork;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        if(str.length()==1){
            System.out.println(str);
        }else {
            StringBuilder ans = new StringBuilder();
            for(int i=str.length()-1;i>=0;i--){
                ans.append(str.charAt(i));
            }
            System.out.println(ans);
        }

        //Time complexity : O(N)
        //Space Complexity : O(N)
    }
}

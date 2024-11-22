package com.practice.DayThree.Practice;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.nextLine();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans.append('%');
            }else{
                ans.append(str.charAt(i));
            }
        }
        System.out.println(ans);
        //Time complexity:O(N)
        //Space complexity:O(N)
    }
}

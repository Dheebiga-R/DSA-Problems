package com.practice.DayThree.Practice;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string and number of rotation::");
        String str = input.next();
        int k = input.nextInt();
        k = k%str.length();
        if(str.length()==1 || str.length()==k){
            System.out.println(str);
        }else{
            StringBuilder ans = new StringBuilder();
            ans.append(str,k,str.length());
            ans.append(str, 0, k);
            System.out.println(ans.toString());
        }

    }
}

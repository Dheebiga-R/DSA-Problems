package com.practice.DayOne.Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = input.nextInt();
        num = Math.abs(num);
        long ans =1;
        for(int i=2;i<=num;i++){
            ans*=i;
        }
        System.out.println(ans);

        //Time complexity : O(n)
        //space complexity : O(1);
    }
}

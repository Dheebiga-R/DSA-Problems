package com.practice.DayFour.Practice;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of steps::");
        int n = input.nextInt();
        int ans = noOfWays(n);
        System.out.println("Number of ways to climb stairs:: "+ans);
    }

    private static int noOfWays(int n) {
        //at step 0 and 1 there is only one possible way
        if(n==0 || n==1){
            return 1;
        }
        //we can move either 1 or 2 steps at a time
        //input :4 , output: 5ways->(1,2,3,4),(0,2,3,4).(1,3,4),(1,2,4),(0,2,4)
        return noOfWays(n-1)+noOfWays(n-2);
    }
    //Time complexity:O((1+sqrt(5))/2) or O(1.6180)^n -->golden ratio
    //Space complexity:O(N)
}

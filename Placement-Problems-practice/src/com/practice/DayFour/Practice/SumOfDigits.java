package com.practice.DayFour.Practice;

import java.util.Scanner;

public class SumOfDigits {
    static int sum =0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number::");
        int n = input.nextInt();
        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        if(n==0){
            return 0;
        }
        sum = n%10 + sumOfDigits(n/10);
        return sum;
    }

    //Time complexity:O(logN)
    //Space complexity:O(logN)
}

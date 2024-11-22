package com.practice.DayOne.Practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = input.nextInt();
        int sum=0;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of digits :: "+ sum);

        //Time complexity : O(logN)
        //space complexity : O(1);
    }
}

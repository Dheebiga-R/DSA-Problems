package com.practice.DayOne.Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = input.nextInt();
        int first = 0 ,second = 1;
        while(num>0){
            System.out.print(first+" ");
            int temp = second;
            second = first +second;
            first = temp;
            num--;
        }
        //Time complexity : O(n)
        //space complexity : O(1);
    }
}

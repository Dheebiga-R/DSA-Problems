package com.practice.DayFour.Practice;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number::");
        int n = input.nextInt();
        //To print n fibonacci number
//        for(int i=1;i<=n;i++){
//            System.out.print(fibonacci(i)+" ");
//        }

        //To calculate nth fibonacci number
        System.out.println(n+"th fibonacci number is ::"+ fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n<2) {
            return n;
        }
         return fibonacci(n-1)+fibonacci(n-2);
    }

    //Time complexity:O((1+sqrt(5))/2) or O(1.6180)^n -->golden ratio
    //Space complexity:O(N)
}

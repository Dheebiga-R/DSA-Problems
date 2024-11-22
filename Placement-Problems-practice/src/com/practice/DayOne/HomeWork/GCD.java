package com.practice.DayOne.HomeWork;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers::");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num2==0 || num1==0){
            System.out.println("Invalid inputs");
        }else {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            System.out.println(num1);
        }

        //Time complexity : O(log(min(num1,num2)))
        //Space Complexity : O(1)
    }
}

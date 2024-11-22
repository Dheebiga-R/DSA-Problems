package com.practice.DayOne.HomeWork;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = input.nextInt();
        int even =2;
        while(num>0){
            System.out.print(even+" ");
            even+=2;
            num--;
        }

        //Time complexity : O(N)
        //Space Complexity : O(1)
    }
}

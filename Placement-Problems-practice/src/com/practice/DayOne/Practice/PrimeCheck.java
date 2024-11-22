package com.practice.DayOne.Practice;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = input.nextInt();

        if(num<=1){
            System.out.println(num + " is not a prime number");
        }else{
            boolean flag = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(num + " is a prime number");
            }else{
                System.out.println(num + " is not a prime number");
            }
        }
        //Time complexity : O(sqrt(n))
        //space complexity : O(1);
    }
}

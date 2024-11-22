package com.practice.DayOne.HomeWork;

import java.util.Scanner;

public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int num = input.nextInt();
        int[] arr = new int[num];
        //getting user input
        for(int i=0;i<num;i++){
            arr[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<num;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number is :"+max+" and Minimum number is :"+min);

        //Time Complexity : O(N)
        //space Complexity :O(1)
    }
}

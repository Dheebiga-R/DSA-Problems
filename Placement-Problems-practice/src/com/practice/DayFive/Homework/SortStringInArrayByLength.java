package com.practice.DayFive.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringInArrayByLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the string elements::");
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = input.next();
        }
        sortByStringLength(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortByStringLength(String[] arr) {
        for(int i=0;i<arr.length;i++){
            int max =0,index=0;
            int last = arr.length-1-i;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j].length()>max){
                    max = arr[j].length();
                    index=j;
                }
            }
            String temp = arr[index];
            arr[index] = arr[last];
            arr[last] = temp;
        }
    }
    //Time complexity:O(N*N)
    //Space complexity:0(1)
}

package com.practice.DayFive.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class SortHalfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        sortHalf(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortHalf(int[] arr) {
        int n =arr.length/2;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    int temp =arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //Time complexity:O(N*N)
    //Space complexity:O(1)
}

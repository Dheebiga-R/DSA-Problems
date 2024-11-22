package com.practice.DayFive.Homework;

import java.util.Scanner;

public class CheckArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        if(isArraySorted(arr,0)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }

    private static boolean isArraySorted(int[] arr,int i) {
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && isArraySorted(arr,i+1);
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

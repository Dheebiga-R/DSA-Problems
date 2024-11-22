package com.practice.DayTwo.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements in sorted order::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter how many times the array wants to rotate::");
        int k = input.nextInt();
        if(arr.length==1 || k==n){
            System.out.println(Arrays.toString(arr));
        }else {
            k=k%n;
            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //Time complexity:O(N)
    //Space complexity:O(1)
}

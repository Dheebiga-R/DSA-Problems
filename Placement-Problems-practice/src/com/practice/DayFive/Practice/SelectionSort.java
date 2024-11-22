package com.practice.DayFive.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = 0 ;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int temp=arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }
    //Time complexity:O(N*N)
    //Space complexity:O(1)
}

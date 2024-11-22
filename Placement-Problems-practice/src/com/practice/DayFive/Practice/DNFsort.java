package com.practice.DayFive.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class DNFsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        dnfSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void dnfSort(int[] arr) {
        int low=0,mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Time complexity:O(N)
    //Space complexity:O(1)
}

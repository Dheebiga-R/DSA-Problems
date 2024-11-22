package com.practice.DaySix.Homework;

import java.util.Scanner;

public class FindPeakInCircularSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array::");
        int n= input.nextInt();
        System.out.println("Enter elements of an array::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int ans = findPeak(arr);
        System.out.println(ans);
    }

    private static int findPeak(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid>0 && arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }else if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return arr[mid];
            }else{
                if(arr[mid]>arr[start]){
                    start = mid;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    //Time complexity:O(logN)
    //Space complexity:O(1)
}

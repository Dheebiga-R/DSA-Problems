package com.practice.DayTwo.Homework;

import java.util.Scanner;

public class FindMinInRotationArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int ans = findMinInRotationArray(arr);
        System.out.println(arr[ans+1]);
    }

    private static int findMinInRotationArray(int[] arr) {
            int start=0,end=arr.length-1;
            while(start<end) {
                int mid = start + (end - start) / 2;
                if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                    return mid;
                }else if(mid>0 && arr[mid]<arr[mid-1]){
                    return mid-1;
                }else{
                    if(arr[mid]>arr[start]){
                        start=mid;
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

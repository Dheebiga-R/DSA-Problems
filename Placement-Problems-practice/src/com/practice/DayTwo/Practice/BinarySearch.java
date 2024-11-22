package com.practice.DayTwo.Practice;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements in ascending order::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target element::");
        int target = input.nextInt();
        int ans = binarySearch(arr,target);
        if(ans==-1){
            System.out.println("Target element is not found");
        }else{
            System.out.println("Target element found at the index of :: "+ans);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        int start=0,end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

        //Time Complexity :O(logN)
        //Space Complexity :O(1)
    }
}

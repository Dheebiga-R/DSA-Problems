package com.practice.DaySix.Practice;

import java.util.Scanner;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target element::");
        int target = input.nextInt();
        int ans = searchInRotatedArray(arr,target);
        if(ans==-1){
            System.out.println("Target element is not found");
        }else{
            System.out.println("Target element found at the index of :: "+ans);
        }
    }

    private static int searchInRotatedArray(int[] arr, int target) {
        return helperFunction(arr,target,0,arr.length-1);
    }

    private static int helperFunction(int[] arr, int target, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid = start +(end - start)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[start]<=arr[mid]){
            if(target<=arr[mid] && target>=arr[start]){
                return helperFunction(arr,target,start,mid-1);
            }else{
                return helperFunction(arr,target,mid+1,end);
            }
        }

        if(target>=arr[mid] && target<=arr[end]){
            return helperFunction(arr,target,mid+1,end);
        }
        return helperFunction(arr,target,start,mid-1);
    }
    //Time Complexity :O(logN)
    //Space Complexity :O(logN)
}

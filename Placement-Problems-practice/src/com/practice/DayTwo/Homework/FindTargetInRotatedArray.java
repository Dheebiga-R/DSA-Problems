package com.practice.DayTwo.Homework;

import java.util.Scanner;

public class FindTargetInRotatedArray {
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
        int k= input.nextInt();
        int ans = findTarget(arr,k);
        if(ans==-1){
            System.out.println("Element not found");
        }else{
            System.out.println(ans);
        }
    }

    private static int findTarget(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(arr[pivot] == target || pivot==-1){
            return pivot;
        }
        else if(target>arr[pivot]){
            return binarysearch(arr,0,pivot-1,target);
        }else{
            return binarysearch(arr,pivot+1,arr.length-1,target);
        }
    }

    private static int binarysearch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    private static int findPivot(int[] arr) {
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

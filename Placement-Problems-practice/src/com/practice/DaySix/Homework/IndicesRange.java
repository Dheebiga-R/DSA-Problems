package com.practice.DaySix.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class IndicesRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array::");
        int n= input.nextInt();
        System.out.println("Enter elements of an array::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element::");
        int k = input.nextInt();
        System.out.println(Arrays.toString(findIndicesRange(arr,k)));
    }

    private static int[] findIndicesRange(int[] arr, int target) {
        int[] range = {-1,-1};
        int first = findFirstOccurrence(arr,target);
        if(first==-1){
            return range;
        }
        int last = findLastOccurrence(arr,target);
        range[0] =first;
        range[1]=last;
        return range;
    }

    private static int findLastOccurrence(int[] arr, int target) {
        int start=0,end=arr.length;
        int result=-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                result = mid;
                start = mid+1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return result;
    }

    private static int findFirstOccurrence(int[] arr, int target) {
        int start=0,end=arr.length;
        int result=-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                result = mid;
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return result;
    }
    //Time complexity:O(logN)
    //Space complexity:O(1)
}

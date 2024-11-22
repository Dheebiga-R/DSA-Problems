package com.practice.DaySix.Practice;

import java.util.Scanner;

public class FindFirstOccurrence {
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
        int ans = fisrtOccurrence(arr,target);
        if(ans==-1){
            System.out.println("Element not found in array");
        }else{
            System.out.println("First occurrence index is: "+ans);
        }
    }

    private static int fisrtOccurrence(int[] arr, int target) {
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

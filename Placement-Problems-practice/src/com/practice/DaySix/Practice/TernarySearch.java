package com.practice.DaySix.Practice;

import java.util.Scanner;

public class TernarySearch {
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
        int ans = ternarySearch(arr,target);
        if(ans==-1){
            System.out.println("Target element is not found");
        }else{
            System.out.println("Target element found at the index of :: "+ans);
        }
    }

    private static int ternarySearch(int[] arr, int target) {
        int start =0,end =arr.length-1;
        while(start<=end){
            int mid1 = start + (end - start)/3;
            int mid2 = end - (end - start)/3;
            if(arr[mid1]==target){
                return mid1;
            }
            if(arr[mid2]==target){
                return mid2;
            }
            if(target>arr[mid1]){
                start = mid1 + 1;
            }else{
                end = mid1 - 1;
            }
            if(target>arr[mid2]){
                start = mid2 + 1;
            }else{
                end = mid2 - 1;
            }
        }
        return -1;
    }
    //Time complexity:O(log3(N))
    //Space complexity:O(1)
}

package com.practice.DaySix.Practice;

import java.util.Scanner;

public class JumpSearch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n= input.nextInt();
        System.out.println("Enter the elements in sorted order:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to search:");
        int target = input.nextInt();
        int ans = jumpSearch(arr,target);
        if(ans!=-1) {
            System.out.println(ans);
        }
        else{
            System.out.println("Element not found!");
        }
    }

    private static int jumpSearch(int[] arr, int target) {
        int jump = (int)Math.sqrt(arr.length);
        int low=0,high=0;
        for(int i=0;i<arr.length;i+=jump){
            if(arr[i]==target){
                return i;
            }else if(arr[i]<target){
                low = i;
            }else{
                high = i;
                break;
            }
        }
        for(int i=low;i<high;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    //Time complexity:O(sqrt(N)) -->better than linear search but not binary search
    //Space complexity:O(1)
}


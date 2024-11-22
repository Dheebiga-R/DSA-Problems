package com.practice.DaySix.Practice;

import java.util.Scanner;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target element::");
        int target = input.nextInt();
        int ans = linearSearch(arr,target,0);
        if(ans==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found at: "+ans);
        }
    }

    private static int linearSearch(int[] arr, int target,int index) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr,target,index+1);
    }
}

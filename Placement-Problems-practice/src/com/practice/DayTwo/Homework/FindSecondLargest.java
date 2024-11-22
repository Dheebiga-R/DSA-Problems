package com.practice.DayTwo.Homework;

import java.util.Scanner;

public class FindSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int ans = findSecondLargest(arr);
        System.out.println(ans);
    }

    private static int findSecondLargest(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans && arr[i]<max){
                ans = arr[i];
            }
        }
        return ans;
    }
    //Time complexity:O(N)
    //Space complexity:O(1)
}

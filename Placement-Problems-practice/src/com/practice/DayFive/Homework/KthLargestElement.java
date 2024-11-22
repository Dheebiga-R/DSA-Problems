package com.practice.DayFive.Homework;

import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter which largest number you want::");
        int k =input.nextInt();
        int ans = kthLargestElement(arr,k);
        if(ans==-1){
            System.out.println("Please enter proper value!");
        }else {
            System.out.println(k+"th largest element is:"+ ans);
        }
    }

    private static int kthLargestElement(int[] arr, int k) {
        if(arr.length<k){
            return -1;
        }
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for (int j : arr) {
            count[j]++;
        }

        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[index++]= i;
                count[i]--;
            }
        }
        return arr[arr.length-k];
    }
}

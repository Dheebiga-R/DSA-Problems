package com.practice.DaySix.Practice;

import java.util.Scanner;

public class CountOccurrencesInSortedArray {
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
        int ans = countOccurrence(arr,target);
        if(ans==0){
            System.out.println("Element not found in array");
        }else{
            System.out.println("Occurrence count is: "+ans);
        }
    }

    private static int countOccurrence(int[] arr, int target) {
        int max = arr[arr.length-1];
        int[] count = new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        return count[target];
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

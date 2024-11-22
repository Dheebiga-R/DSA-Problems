package com.practice.DayFive.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countSort(int[] arr) {
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
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

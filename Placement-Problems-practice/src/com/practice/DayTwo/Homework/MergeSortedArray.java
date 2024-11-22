package com.practice.DayTwo.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for first array
        System.out.println("Enter size of first array::");
        int n1 = input.nextInt();
        System.out.println("Enter the elements in sorted order::");
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = input.nextInt();
        }
        //for second array
        System.out.println("Enter size of second array::");
        int n2 = input.nextInt();
        System.out.println("Enter the elements in sorted order::");
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = input.nextInt();
        }

        int[] ans = mergeTwoSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] mix = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mix[k] = arr1[i];
                i++;
            }else{
                mix[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            mix[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            mix[k] = arr2[j];
            j++;
            k++;
        }
        return mix;
    }
    //Time complexity:O(M+N)
    //Space complexity:O(M+N)
}

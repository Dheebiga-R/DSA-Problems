package com.practice.DayTwo.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckCompatiblity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //first array
        System.out.println("Enter size of first array::");
        int n1= input.nextInt();
        System.out.println("Enter elements of first array::");
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = input.nextInt();
        }
        //second array
        System.out.println("Enter size of second array::");
        int n2= input.nextInt();
        System.out.println("Enter elements of second array::");
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = input.nextInt();
        }
        if(checkCompatible(arr1,arr2)){
            System.out.println("Two arrays are compatible to each other");
        }else{
            System.out.println("Two arrays aren't compatible to each other");
        }
    }

    private static boolean checkCompatible(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length){
            return false;
        }
        int max1 = findMax(arr1);
        int max2 = findMax(arr2);
        int[] count1 = new int[max1+1];
        int[] count2 = new int[max2+1];
        return Arrays.equals(findCount(count1, arr1), findCount(count2, arr2));
    }

    private static int[] findCount(int[] count, int[] arr) {
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        return count;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

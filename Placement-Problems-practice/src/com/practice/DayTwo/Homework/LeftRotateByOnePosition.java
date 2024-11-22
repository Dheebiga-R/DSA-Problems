package com.practice.DayTwo.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOnePosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        rotateLeftByOnePosition(arr);
    }

    private static void rotateLeftByOnePosition(int[] arr) {
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
    //Time Complexity:O(N);
    //Space complexity:O(1)
}

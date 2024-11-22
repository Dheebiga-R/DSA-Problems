package com.practice.DayFive.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KmostFrequentElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the frequency:");
        int k = input.nextInt();
        List<Integer> ans = kMostFrequent(arr,k);
        if(ans.isEmpty()){
            System.out.println("With this frequency no element found");
        }else{
            System.out.println("Element with "+ k +" frequency is: " + ans);
        }
    }

    private static List<Integer> kMostFrequent(int[] arr, int k) {
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
        List<Integer> list = new ArrayList<>();
        for(int i=0;i< count.length;i++){
            if(count[i]==k){
                list.add(i);
            }
        }
        return list;
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

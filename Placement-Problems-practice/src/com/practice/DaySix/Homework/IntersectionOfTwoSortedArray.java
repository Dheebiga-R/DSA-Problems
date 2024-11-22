package com.practice.DaySix.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfTwoSortedArray {
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
        List<Integer> result = findIntersection(arr1,arr2);
        System.out.println(result);
    }

    private static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        int i=0,j=0;
        List<Integer> list = new ArrayList<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }else if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return list;
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

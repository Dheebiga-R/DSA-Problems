package com.practice.DayTwo.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationsCheck {
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

        if(permutationChecks(arr1,arr2)){
            System.out.println("Two arrays are permutations to each other");
        }else{
            System.out.println("Two arrays aren't permutations to each other");
        }
    }

    private static boolean permutationChecks(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
    //Time complexity:O(Nlog(N))
    //Space complexity:O(1)
}

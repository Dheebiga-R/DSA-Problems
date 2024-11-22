package com.practice.DayTwo.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements in ascending order::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int[] ans = removeDuplicates(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        int[] ans = new int[hash.size()];
        Iterator<Integer> iterator = hash.iterator();
        for(int i=0;i<hash.size();i++){
            ans[i] = iterator.next();
        }
        return ans;
    }

    //Time complexity:O(N)
    //Space complexity:O(N)
}

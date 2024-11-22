package com.practice.DayTwo.Practice;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicate{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        HashSet<Integer> hash = new HashSet<>();
        for(int val:arr) {
            if (!hash.add(val)){
                System.out.print(val+" ");
            }
        }
        //Time complexity: O(N)
        //Space complexity:O(N)
    }
}

package com.practice.DayFour.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CandidateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target::");
        int target = input.nextInt();
        System.out.println("Enter the size of an array::");
        int n =input.nextInt();
        System.out.println("Enter array of elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        List<List<Integer>> list = candidateNumber(arr,target);
        for(List<Integer> ans : list){
            System.out.println(ans);
        }
    }

    public static List<List<Integer>> candidateNumber(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
    //Time complexity:O(2^N)
    //Space complexity:O(N*2^N)
}

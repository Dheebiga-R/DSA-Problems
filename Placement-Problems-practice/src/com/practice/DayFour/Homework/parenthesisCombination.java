package com.practice.DayFour.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class parenthesisCombination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ::");
        int n = input.nextInt();
        List<String> ans = findParanthesis(n);
        System.out.println(ans);
    }

    private static List<String> findParanthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result,"",0,0,n);
        return result;
    }

    private static void backTrack(List<String> result, String str, int openCount, int closeCount, int n) {
        if(str.length()==2*n){
            result.add(str);
            return;
        }
        if(openCount<n){
            backTrack(result,str+"(",openCount+1,closeCount,n);
        }

        if(closeCount<openCount){
            backTrack(result,str+")",openCount,closeCount+1,n);
        }
    }
    //Time complexity:O(2^N)
    //Space complexity:0(2^N)
}

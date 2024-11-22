package com.practice.DayFour.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PathsInGrid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grid size::");
        int n = input.nextInt();
        List<String> ans = findPathsInGrid("",n,n);
        System.out.println(ans);
    }

    private static List<String> findPathsInGrid(String p, int r,int c) {
        if(r==1 && c==1 ){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> ans = new ArrayList<>();
        if(c>1){
            ans.addAll(findPathsInGrid(p+"R",r,c-1));
        }
        if(r>1){
            ans.addAll(findPathsInGrid(p+"D",r-1,c));
        }

        return ans;
    }

}

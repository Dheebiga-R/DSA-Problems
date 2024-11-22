package com.practice.DayFour.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.next();
        System.out.println(countpermutations("",str));
    }

    private static ArrayList<String> permutation(String str) {
        return helperFunction("",str);
    }

    private static ArrayList<String> helperFunction(String ans, String ques) {
        if(ques.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = ques.charAt(0);
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0;i<=ans.length();i++){
            String first = ans.substring(0,i);
            String last = ans.substring(i,ans.length());
            answer.addAll(helperFunction(first+ch+last,ques.substring(1)));
        }
        return answer;
    }
    //Time complexity:O(N*2^N)
    //Space complexity:O(N*2^N)

    private static int countpermutations(String ans, String ques) {
        if(ques.isEmpty()){
            return 1;
        }

        char ch = ques.charAt(0);
        int count=0;
        for(int i=0;i<=ans.length();i++){
            String first = ans.substring(0,i);
            String last = ans.substring(i,ans.length());
            count = count + countpermutations(first+ch+last,ques.substring(1));
        }
        return count;
    }
}

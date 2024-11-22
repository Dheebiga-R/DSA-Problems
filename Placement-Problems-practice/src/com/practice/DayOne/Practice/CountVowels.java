package com.practice.DayOne.Practice;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.nextLine();
        int n = 0;
        int count=0;
        while(n<str.length()){
            char ch = str.charAt(n);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                count++;
            }
            n++;
        }
        System.out.println("Number of vowels in a string::" + count);

        //Time complexity : O(N)
        //space complexity : O(1);
    }
}

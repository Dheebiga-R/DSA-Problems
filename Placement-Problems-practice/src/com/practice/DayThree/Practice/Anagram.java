package com.practice.DayThree.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first string::");
        String str1 = input.next();
        System.out.println("Enter a second string::");
        String str2 = input.next();
        if(isAnagram(str1,str2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        return Arrays.equals(string1,string2);
    }
    //Time complexity:O(Nlog(N))
    //Space complexity:O(N+N)
}

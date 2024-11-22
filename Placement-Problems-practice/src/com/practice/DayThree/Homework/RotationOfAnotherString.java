package com.practice.DayThree.Homework;

import java.util.Scanner;

public class RotationOfAnotherString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str1 = input.nextLine();
        System.out.println("Enter a string::");
        String str2 = input.nextLine();
        if(isrotated(str1,str2)){
            System.out.println(str1 + " is a rotation of "+ str2);
        }else{
            System.out.println(str1 + " is not a rotation of "+ str2);
        }
    }

    private static boolean isrotated(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        str1 = str1+str1;
        return str1.contains(str2);
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

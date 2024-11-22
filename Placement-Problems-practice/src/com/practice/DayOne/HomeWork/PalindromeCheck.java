package com.practice.DayOne.HomeWork;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.next();
        boolean flag = true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

        //Time Complexity : O(N)
        //space Complexity :O(1)
    }
}

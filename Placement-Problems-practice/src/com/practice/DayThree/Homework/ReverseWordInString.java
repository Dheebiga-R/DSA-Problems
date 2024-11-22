package com.practice.DayThree.Homework;

import java.util.Scanner;

public class ReverseWordInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.nextLine();
        StringBuilder word = new StringBuilder();
        StringBuilder rev = new StringBuilder();

        for(int i=0;i<=str.length();i++){
            if(i<str.length() && str.charAt(i)!=' '){
                word.append(str.charAt(i));
            }else{
                if(word.length()>1){
                    for(int j=word.length()-1;j>=0;j--){
                        rev.append(word.charAt(j));
                    }
                    System.out.print(rev+" ");
                }else{
                    System.out.println(word+" ");
                }
                word.delete(0,word.length());
                rev.delete(0,rev.length());
            }
        }

        //Time complexity:O(N)
        //Space complexity:O(N)
    }
}

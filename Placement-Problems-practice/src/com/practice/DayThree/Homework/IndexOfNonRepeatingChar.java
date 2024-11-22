package com.practice.DayThree.Homework;

import java.util.Scanner;

public class IndexOfNonRepeatingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.next();
        int ans = indexofNonRepeating(str);
        if(ans==-1){
            System.out.println("There is no non-repeating character in a string");
        }else{
            System.out.println("Non-repeating character index is "+ans);
        }
    }

    private static int indexofNonRepeating(String str) {
        for(int i=0;i<str.length();i++){
            boolean found = true;
            for(int j=0;j<str.length();j++){
                if(j!=i && str.charAt(i)==str.charAt(j)){
                    found=false;
                    break;
                }
            }
            if(found){
                return i;
            }
        }
        return -1;
    }
    //Time complexity:O(N*N)
    //Space complexity:O(1)
}

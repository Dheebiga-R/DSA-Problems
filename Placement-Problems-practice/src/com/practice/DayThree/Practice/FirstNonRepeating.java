package com.practice.DayThree.Practice;

import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.nextLine();
        char ch = ' ';

        for(int i=0;i<str.length();i++){
            boolean found=true;
            for(int j=0;j<str.length();j++){
                if(j!=i && str.charAt(i)==str.charAt(j)){
                    found=false;
                    break;
                }
            }
            if(found){
                ch = str.charAt(i);
                break;
            }
        }
        if(ch==' '){
            System.out.println("There is no non-repeating character in string");
        }else{
            System.out.println(ch);
        }
        //Time complexity:O(N*N)
        //Space complexity:O(1)
    }
}

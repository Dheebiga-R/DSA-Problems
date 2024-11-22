package com.practice.DayThree.Practice;

import java.util.Scanner;

public class SubStringIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str1 = input.nextLine();
        System.out.println("Enter a substring to check the presence::");
        String str2 = input.nextLine();
        int ans = findIndexOfSubstring(str1,str2);
        if(ans!=-1){
            System.out.println(ans);
        }else{
            System.out.println("Sub string not present");
        }
    }

    private static int findIndexOfSubstring(String str1, String str2) {
        for(int i=0;i<=str1.length()+str2.length();i++){
            boolean found = true;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    found = false;
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

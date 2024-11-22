package com.practice.DaySeven.Practice;

import java.util.Scanner;
import java.util.Stack;

public class CheckBalancedParenthesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string::");
        String str = input.nextLine();
        if(isBalanced(str)){
            System.out.println(str +" is balanced parenthesis");
        }else{
            System.out.println(str +" is not balanced parenthesis");
        }
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch==')'&&top!='(')||(ch==']'&&top!='[')||(ch=='}'&&top!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

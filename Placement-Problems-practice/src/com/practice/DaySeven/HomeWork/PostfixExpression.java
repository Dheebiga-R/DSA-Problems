package com.practice.DaySeven.HomeWork;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expression::");
        String str = input.nextLine();
        double ans = evaluatePostfix(str);
        if(ans==-1){
            System.out.println("Enter the proper Expression");
        }else {
            System.out.println("Solution for expression:: " + ans);
        }
    }

    private static double evaluatePostfix(String str) {
        if(str.length()<2){
            return -1;
        }
        Stack<Double> stack = new Stack<>();
        double ans =0;
        String str1="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '&& ch!='+'&& ch!='-'&&ch!='*'&&ch!='/'){
                str1=str1+ch;
            }else if(ch==' '){
                if(!str1.isEmpty()) {
                    double num = Double.parseDouble(str1);
                    str1 = "";
                    stack.push(num);
                }
            }
            else{
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    ans = operation(num2,num1,ch);
                    stack.push(ans);
            }
        }
        return stack.pop();
    }

    private static double operation(double num1, double num2, char ch) {
        return switch (ch) {
            case '+':
                yield num1 + num2;
            case '-':
                yield num1-num2;
            case '*':
                yield num1 * num2;
            case '/':
                if (num2!=0) {
                    yield num1/num2;
                }else{
                    System.out.println("Illegal operation");
                }
            default:
                throw new IllegalStateException("Unexpected operator: " + ch);
        };
    }
}

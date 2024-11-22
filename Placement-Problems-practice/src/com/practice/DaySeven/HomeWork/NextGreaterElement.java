package com.practice.DaySeven.HomeWork;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size::");
        int n = input.nextInt();
        System.out.println("Enter the elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int[] res = nextGreaterElement(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] nextGreaterElement(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=-1; //initialize to -1
        }
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++){
            //check if stack is not empty and compare the peek index with the current element
            //and if the element is greater and push the index to the stack
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                int index = stack.pop();
                ans[index] = arr[i];
            }
            stack.push(i);
        }
        return ans;
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

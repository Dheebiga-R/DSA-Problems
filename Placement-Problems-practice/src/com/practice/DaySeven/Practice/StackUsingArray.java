package com.practice.DaySeven.Practice;

import java.util.Scanner;

class Stack{
    int top;
    int size;
    int[] arr;

    public Stack(int n) {
        this.size=n;
        this.arr = new int[size];
        this.top=-1;
    }

    public void push(int num) {
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        arr[++top]=num;
        System.out.println(num+" is pushed");
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        int num =arr[top--];
        System.out.println(num+" is removed");
    }

    private boolean isFull() {
        return top==size-1;
    }

    private boolean isEmpty() {
        return top==-1;
    }

    public int peek() {
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Stack is empty, no element to display!");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class StackUsingArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size::");
        int n = input.nextInt();
        Stack stack = new Stack(n);

        while(true){
            System.out.print("Enter the choice::");
            System.out.print(" 1.Push");
            System.out.print(" 2.Pop");
            System.out.print(" 3.Peek");
            System.out.print(" 4.Display");
            System.out.print(" 5.Exit");
            System.out.println();
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter a element::");
                    int num = input.nextInt();
                    stack.push(num);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int ans = stack.peek();
                    if(ans==-1){
                        System.out.println("Stack is empty");
                    }else {
                        System.out.println("peek element is " + ans);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        }
    }
    //Time complexity:O(1)
    //Space complexity:O(N)
}

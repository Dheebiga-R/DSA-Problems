package com.practice.DaySeven.Practice;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int num) {
        this.data = num;
        this.next = null;
    }
}
class StackLink{
    private final int size;
    private Node head;
    private Node temp;
    private int top;

    public StackLink(int size) {
        this.size=size;
        this.head = null;
        this.temp = null;
        this.top = -1;
    }

    public void push(int num) {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        Node newnode = new Node(num);
        if(head ==null){
            head = temp =newnode;
        }else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            temp=newnode;
        }
        top++;
        System.out.println("Data is pushed in stack");
    }

    public void display() {
        if(isEmpty()){
            System.out.println("No element to display");
            return;
        }
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        if(head==temp){
            int num = head.data;
            head=temp=null;
            top--;
            System.out.println(num+" is removed from stack");
            return;
        }
        Node nextnode = head;
        while(nextnode.next!=temp){
            nextnode = nextnode.next;
        }
        int num = temp.data;
        temp = nextnode;
        temp.next =null;
        top--;
        System.out.println(num+" is removed from stack");
    }

    private boolean isFull() {
        return top==size-1;
    }

    private boolean isEmpty() {
        return head==null;
    }

    public int peek() {
        if(isEmpty()){
            return -1;
        }
        return temp.data;
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size::");
        int n = input.nextInt();

        StackLink sl = new StackLink(n);

        while(true) {
            System.out.print("Enter the choice::");
            System.out.print(" 1.Push");
            System.out.print(" 2.Pop");
            System.out.print(" 3.Peek");
            System.out.print(" 4.Display");
            System.out.print(" 5.Exit");
            System.out.println();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a element::");
                    int num = input.nextInt();
                    sl.push(num);
                    break;
                case 2:
                    sl.pop();
                    break;
                case 3:
                    int ans = sl.peek();
                    if (ans == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("peek element is " + ans);
                    }
                    break;
                case 4:
                    sl.display();
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

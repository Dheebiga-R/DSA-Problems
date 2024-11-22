package com.practice.DayEight.Homework;

import java.util.Scanner;

class NodeSplit {
    int data;
    NodeSplit next;

    NodeSplit(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListSplit {
    NodeSplit head1;
    NodeSplit head2;
    public void insert(int num) {
        NodeSplit newNode = new NodeSplit(num);
        if (head1 == null) {
            head1 = newNode;
            return;
        }
        NodeSplit temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void splitList() {
        if(head1 == null){
            System.out.println("No element to split");
            return;
        }
        else if(head1.next==null){
            System.out.println("Contain one element in a list");
        }else {
            NodeSplit temp = head1;
            //find length of the list
            int end = 0;
            while (temp.next != null) {
                temp = temp.next;
                end++;
            }
            //find mid index
            int mid = end/2;
            //find element by mid value
            int index=0;
            temp = head1;
            while(index<mid){
                temp = temp.next;
                index++;
            }
            head2 = temp.next;
            temp.next = null;
            System.out.print("First half:");
            display(head1);
            System.out.print("Second half:");
            display(head2);
        }
    }

    public void display(NodeSplit head) {
        if (head == null) {
            System.out.println("No element to display");
            return;
        }
        NodeSplit temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class SplitLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        LinkedListSplit ll = new LinkedListSplit();
        for(int i=0;i<n;i++){
            int num = input.nextInt();
            ll.insert(num);
        }

        ll.splitList();
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

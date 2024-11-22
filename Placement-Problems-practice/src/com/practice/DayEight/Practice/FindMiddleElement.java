package com.practice.DayEight.Practice;

import java.util.Scanner;

class NodeMid {
    int data;
    NodeMid next;

    NodeMid(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListMid {
    NodeMid head;

    public void insert(int num) {
        NodeMid newNode = new NodeMid(num);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeMid temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void findMid() {
        if(head == null){
            System.out.println("No element to display");
            return;
        }else {
            NodeMid temp = head;
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
            temp = head;
            while(index<mid){
                temp = temp.next;
                index++;
            }
            if(end%2==0){
                System.out.println("Mid element is ::"+temp.data);
            }else{
                System.out.println("Mid elements are ::"+temp.data+" "+temp.next.data);
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("No element to display");
            return;
        }
        NodeMid temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class FindMiddleElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        LinkedListMid ll = new LinkedListMid();
        for(int i=0;i<n;i++){
            int num = input.nextInt();
            ll.insert(num);
        }
        ll.findMid();
    }
    //Time complexity:O(N)
    //Space complexity:O(1)
}

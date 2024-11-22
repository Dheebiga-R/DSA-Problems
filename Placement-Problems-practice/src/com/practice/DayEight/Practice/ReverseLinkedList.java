package com.practice.DayEight.Practice;

import java.util.Scanner;
class NodeRev {
    int data;
    NodeMid next;

    NodeRev(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLinkedList {
    NodeMid head;

    public void insert(int num) {
        NodeMid newnode = new NodeMid(num);
        if(head==null){
            head = newnode;
            return;
        }
        NodeMid temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    private void reverse() {
        if(head==null){
            System.out.println("No element to reverse");
            return;
        }else{
            NodeMid prev =null;
            NodeMid current = head;
            NodeMid nextNode = head;
            while(current.next!=null){
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            current.next=prev;
            head = nextNode;
        }
    }

    public void display() {
        if(head==null){
            System.out.println("No element to display");
            return;
        }
        NodeMid temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReverseLinkedList rll = new ReverseLinkedList();
        System.out.println("Enter the size::");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            int data = input.nextInt();
            rll.insert(data);
        }
        rll.reverse();
        rll.display();
    }
    //Time complexity:O(N)
    //Space complexity:O(1)
}

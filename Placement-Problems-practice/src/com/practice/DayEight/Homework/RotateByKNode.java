package com.practice.DayEight.Homework;

import java.util.Scanner;

class NodeRot {
    int data;
    NodeRot next;

    NodeRot(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListRotate{
    NodeRot head;

    public void insert(int num) {
        NodeRot newNode = new NodeRot(num);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeRot temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //rotate
    public void rotate(int k) {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        int length = getLength();
        k = k%length;
        NodeRot lastNode = head;
        NodeRot temp = head;
        //to find last node
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }

        while(k>0){
            lastNode.next=temp;
            lastNode = temp;
            head = head.next;
            temp.next = null;
            temp = head;
            k--;
        }

    }

    private int getLength() {
        if(head==null){
            return 0;
        }
        int index=0;
        NodeRot temp =head;
        while(temp!=null){
            index++;
            temp=temp.next;
        }
        return index;
    }

    public void display() {
        if (head == null) {
            System.out.println("No element to display");
            return;
        }
        NodeRot temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class RotateByKNode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        LinkedListRotate ll = new LinkedListRotate();
        for(int i=0;i<n;i++){
            int num = input.nextInt();
            ll.insert(num);
        }
        System.out.println("Enter number of rotation::");
        int k =input.nextInt();
        System.out.println("Before rotation::");
        ll.display();
        System.out.println("After rotation::");
        ll.rotate(k);
        ll.display();
    }
    //Time complexity:O(N)
    //Space complexity:O(1)
}

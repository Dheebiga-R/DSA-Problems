package com.practice.DayEight.Homework;

import java.util.HashSet;
import java.util.Scanner;

class NodeDup {
    int data;
    NodeRot next;

    NodeDup(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListDup {
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

    //To remove duplicates
    public void removeDuplicates() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        NodeRot temp=head;
        NodeRot prev=null;
        while(temp!=null){
            if(hashSet.add(temp.data)){
                prev = temp;
                temp = temp.next;
            }else{
                prev.next =temp.next;
                temp = prev.next;
            }
        }
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
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        LinkedListDup ll = new LinkedListDup();
        for(int i=0;i<n;i++){
            int num = input.nextInt();
            ll.insert(num);
        }
        System.out.println("Before removing duplicates::");
        ll.display();
        System.out.println("After removing duplicates::");
        ll.removeDuplicates();
        ll.display();
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

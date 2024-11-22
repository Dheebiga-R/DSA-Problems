package com.practice.DayEight.Practice;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;

    LinkedList(){
        this.head=null;
    }

    public void insert(int num) {
        Node newnode = new Node(num);
        if(head==null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void remove(int data) {
        if(head==null){
            System.out.println("No element to remove");
            return;
        }
        if(head.data==data){
            if(head.next==null) {
                head = null;
                return;
            }
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp.data!=data){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void display() {
        if(head==null){
            System.out.println("No element to display");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int search(int val) {
        if(head==null){
            return -1;
        }
        Node temp=head;
        int index=0;
        while(temp!=null && temp.data!=val){
            temp =temp.next;
            index++;
        }
        if(temp==null){
            return -1;
        }else{
            return index;
        }
    }
}
public class SinglyLinkedList{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while(true){
            System.out.print("1.Insertion");
            System.out.print("2.Deletion");
            System.out.print("3.Display");
            System.out.print("4.Search");
            System.out.print("5.Exit");
            System.out.println();
            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter an element to insert:");
                    int num = input.nextInt();
                    ll.insert(num);
                    break;
                case 2:
                    System.out.println("Enter which element to remove");
                    int data = input.nextInt();
                    ll.remove(data);
                    break;
                case 3:
                    ll.display();
                    break;
                case 4:
                    System.out.println("Enter the element to search");
                    int val = input.nextInt();
                    int index = ll.search(val);
                    if(index==-1){
                        System.out.println("Element not found");
                    }else{
                        System.out.println("Element found at index:"+index);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Illegal operation!!");
            }
        }
    }
    //Time complexity: Insertion -> O(1),O(N) Deletion -> 0(1),O(N),search -> O(N)
    //Space complexity:O(N)
}


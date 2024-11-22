package com.practice.DayEight.Practice;

import java.util.Scanner;

//node structure
class NodeDetect {
    int data;
    NodeDetect next;

    //constructor
    public NodeDetect(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedListPro {
    NodeDetect head;

    //insert the data
    public void insert(int data) {
        NodeDetect newNode=new NodeDetect(data);
        //check if the list is empty
        if(head==null) {
            head=newNode;
        }else {
            NodeDetect temp=head;
            while(temp.next!=null) {
                temp=temp.next;//move to next node
            }
            temp.next=newNode;//set the new node at the end of list
        }

    }

    public void createLoop(int pos) {
        if(pos==-1)
            return ;

        NodeDetect temp=head;
        NodeDetect loopnode=null;
        int count=0;

        while(temp.next!=null) {
            if(count==pos) {
                loopnode=temp;
            }
            temp=temp.next;
            count++;
        }
        //create the loop by pointing the last node in loop node
        temp.next=loopnode;

    }

    public boolean detectLoop() {
        //slow and fast pointer
        NodeDetect slow = head;
        NodeDetect fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;//move slow pointer 1 step
            fast = fast.next.next;//move fast 2 step

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
public class LoopDetection {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedListPro ll=new LinkedListPro();

        System.out.println("Enter the size ::");
        int n=sc.nextInt();//no of nodes to insert in list
        System.out.println("Enter an elements");
        for(int i=0;i<n;i++) {
            int value=sc.nextInt();
            ll.insert(value);
        }
        System.out.println("Enter the position");
        // input to create a position to create the loop or -1
        int pos=sc.nextInt();
        ll.createLoop(pos);

        //detect the loop
        if(ll.detectLoop()) {
            System.out.println("Loop Detected in Linked lists");
        }else {
            System.out.println("No Loop Detected in List");
        }
    }

    //Time complexity:O(N)
    //Space complexity:O(1)
}


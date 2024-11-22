package com.practice.DaySeven.Practice;

import java.util.Scanner;

class Nodeq{
    int data;
    Nodeq next;

    public Nodeq(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue{
    Nodeq front;
    Nodeq rear;
    int capacity ;
    int size;

    public Queue(int n) {
        this.front = null;
        this.rear = null;
        this.capacity = n;
        this.size = -1;
    }

    public void enqueue(int num) {
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        Nodeq newnode = new Nodeq(num);
        if(front==null){
            front=rear =newnode;
        }else{
            rear.next = newnode;
            rear = newnode;
            size++;
        }
        System.out.println(num+" is enqueued");
    }

    public int dequeue() {
        if(isEmpty()){
            return -1;
        }
        int num = front.data;
        front = front.next;
        size--;
        return num;
    }

    private boolean isEmpty() {
        return front==null;
    }

    private boolean isFull() {
        return size==capacity-1;
    }

    public void display() {
        if(isEmpty()){
            System.out.println("No element to display");
            return;
        }
        Nodeq temp = front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size::");
        int n = input.nextInt();

        Queue queue = new Queue(n);

        while(true){
            System.out.print("Enter a choice::");
            System.out.print("1.Enqueue");
            System.out.print("2.Dequeue");
            System.out.print("3.Display");
            System.out.print("4.Exit");
            System.out.println();
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter an element to enqueue");
                    int num1 =input.nextInt();
                    queue.enqueue(num1);
                    break;
                case 2:
                    int num2 = queue.dequeue();
                    if(num2!=-1) {
                        System.out.println(num2 + " is dequeued");
                    }else{
                        System.out.println("No element to perform dequeue operation");
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation!!!");
                    break;
            }
        }
    }
    //Time complexity:O(1)
    //Space complexity:O(N)
}

package com.practice.DaySeven.Practice;

import java.util.Scanner;

class QueueArray{
    int rear;
    int size;
    int[] arr;

    public QueueArray(int n) {
        this.rear=-1;
        this.size=n;
        this.arr = new int[size];
    }

    public void enqueue(int num1) {
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = num1;
    }

    private boolean isFull() {
        return rear == size-1;
    }

    public int dequeue() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear--];
    }

    private boolean isEmpty() {
        return rear==-1;
    }

    public void display() {
        if(isEmpty()){
            System.out.println("No element to display");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size::");
        int n= input.nextInt();

        QueueArray qa = new QueueArray(n);

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
                    qa.enqueue(num1);
                    break;
                case 2:
                    int num2 = qa.dequeue();
                    if(num2!=-1) {
                        System.out.println(num2 + " is dequeued");
                    }else{
                        System.out.println("No element to perform dequeue operation");
                    }
                    break;
                case 3:
                    qa.display();
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

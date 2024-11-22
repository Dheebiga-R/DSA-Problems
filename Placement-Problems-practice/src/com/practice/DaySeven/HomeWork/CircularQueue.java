package com.practice.DaySeven.HomeWork;

import java.util.Scanner;

//creating a circularQueue using linked list
class Circular{
    private int front;
    private int rear;
    private int size;
    private int currentSize;
    private int[] arr;


    public Circular(int n) {
        this.front=0;
        this.rear=-1;
        this.currentSize=0;
        this.size=n;
        this.arr = new int[size];
    }

    public void enqueue(int num1) {
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear+1)%size;
        arr[rear] = num1;
        currentSize++;
        System.out.println(num1+" is enqueued");
    }

    private boolean isFull() {
        return currentSize==size;
    }

    public int dequeue() {
        if(isEmpty()){
            return -1;
        }
        int num = arr[front];
        front = (front+1)%size;
        currentSize--;
        for(int i=front;i<=rear;i++){
            arr[i-1] = arr[i];
        }
        rear--;
        return num;
    }

    private boolean isEmpty() {
        return currentSize==0;
    }

    public void display() {
        if(isEmpty()){
            System.out.println("No element to display");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class CircularQueue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the circular Queue::");
        int n = input.nextInt();

        Circular cq = new Circular(n);

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
                    cq.enqueue(num1);
                    break;
                case 2:
                    int num2 = cq.dequeue();
                    if(num2!=-1) {
                        System.out.println(num2 + " is dequeued");
                    }else{
                        System.out.println("No element to perform dequeue operation");
                    }
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation!!!");
                    break;
            }
        }

        //Time complexity:O(1)
        //Space complexity:O(N)
    }
}

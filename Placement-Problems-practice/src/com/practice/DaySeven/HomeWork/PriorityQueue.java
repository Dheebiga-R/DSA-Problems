package com.practice.DaySeven.HomeWork;

import java.util.Scanner;

class Node {
    int element;
    int priority;
    Node(int element, int priority) {
        this.element = element;
        this.priority = priority;
    }
}

class PriorityQueueImpl {
    private Node[] queue;
    private int size;

    public PriorityQueueImpl(int capacity) {
        this.queue = new Node[capacity];
        this.size = 0;
    }

    public void enqueue(int element, int priority) {
        // Create a new node with the given element and priority
        Node newNode = new Node(element, priority);
        // Find the position to insert the new node
        int i;
        for (i = size - 1; (i >= 0 && queue[i].priority > newNode.priority); i--) {
            queue[i + 1] = queue[i];
        }
        queue[i + 1] = newNode;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        Node data = queue[--size];
        System.out.println(data.element+" is dequeued");
    }

    private boolean isEmpty() {
        return size==0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int data = queue[size-1].element;
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Priority Queue (sorted by priority):");
        for (int i = 0; i < size; i++) {
            System.out.println("Element: " + queue[i].element + ", Priority: " + queue[i].priority);
        }
    }
}
public class PriorityQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size::");
        int n =input.nextInt();
        PriorityQueueImpl priorityQueue = new PriorityQueueImpl(n);

        for(int i=0;i<n;i++){
            System.out.println("Element");
            int element = input.nextInt();
            System.out.println("Priority");
            int priority = input.nextInt();
            priorityQueue.enqueue(element, priority);
        }
        priorityQueue.display();
        int peekElement = priorityQueue.peek();
        System.out.println("Peek element is "+peekElement);
    }
}
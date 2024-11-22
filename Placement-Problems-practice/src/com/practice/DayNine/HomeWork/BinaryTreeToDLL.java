package com.practice.DayNine.HomeWork;

import java.util.Scanner;

class Node {
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        this.left =null;
        this.right=null;
    }
}
class BinaryTreeDLL{
    Node root;
    Node head = null;
    Node tail = null;

    public Node insert(Node root, int data) {
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            root.left = insert(root.left,data);
        }else if(data>root.data){
            root.right =insert(root.right,data);
        }
        return root;
    }

    public void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void binaryToDLL(Node root) {
        if(root==null){
            return;
        }
        binaryToDLL(root.left);

        if (tail == null) {
            head = root;
        } else {
            root.left = tail;
            tail.right = root;
        }
        tail = root;
        binaryToDLL(root.right);
    }

    public void printDLL() {
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.right;
        }
    }
}
public class BinaryTreeToDLL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        BinaryTreeDLL bt  = new BinaryTreeDLL();

        for(int i=0;i<n;i++){
            int data = input.nextInt();
            bt.root = bt.insert(bt.root,data);
        }

        System.out.print("Elements in tree:: ");
        bt.inorder(bt.root);
        System.out.println();
        System.out.println("After converting Binary tree to Doubly Linked list");
        bt.binaryToDLL(bt.root);
        bt.printDLL();
    }
}

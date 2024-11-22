package com.practice.DayNine.HomeWork;

import java.util.Scanner;

class NodeSum {
    int data;
    Node left,right;

    NodeSum(int data){
        this.data = data;
        this.left =null;
        this.right=null;
    }
}
class BinaryTreeSum{
    Node root;

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

    public int findSum(Node root) {
        if(root==null){
            return 0;
        }
        int sum = root.data + findSum(root.left) + findSum(root.right);
        return sum;
    }
}
public class SumOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        BinaryTreeSum bt  = new BinaryTreeSum();

        for(int i=0;i<n;i++){
            int data = input.nextInt();
            bt.root = bt.insert(bt.root,data);
        }

        System.out.print("Elements in tree:: ");
        bt.inorder(bt.root);
        System.out.println();

        int sum = bt.findSum(bt.root);
        if(sum==-1){
            System.out.println("Tree is empty");
        }else{
            System.out.println("Sum of all elements in tree is:: "+sum);
        }
    }
}




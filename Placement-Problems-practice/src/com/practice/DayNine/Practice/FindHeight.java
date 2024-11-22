package com.practice.DayNine.Practice;

import java.util.Scanner;

class NodeHigh {
    int data;
    NodeHigh left,right;

    NodeHigh(int data){
        this.data = data;
        this.left =null;
        this.right=null;
    }
}
class BinaryTreeHeight{
    NodeHigh root;

    public NodeHigh insert(NodeHigh root, int data) {
        if(root==null){
            root=new NodeHigh(data);
            return root;
        }
        if(data<root.data){
            root.left = insert(root.left,data);
        }else if(data>root.data){
            root.right =insert(root.right,data);
        }
        return root;
    }

    public void inorder(NodeHigh root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public int findHeight(NodeHigh root,int count) {
        if(root==null){
            return -1;
        }
        int left = findHeight(root.left,count+1);
        int right =findHeight(root.right,count+1);
        return Math.max(left,right)+1;
    }
}
public class FindHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        BinaryTreeHeight bt  = new BinaryTreeHeight();

        for(int i=0;i<n;i++){
            int data = input.nextInt();
            bt.root = bt.insert(bt.root,data);
        }

        System.out.print("Elements in tree:: ");
        bt.inorder(bt.root);
        System.out.println();

        int height = bt.findHeight(bt.root,0);
        if(height==-1){
            System.out.println("Tree is empty");
        }else{
            System.out.println("Height of the binary tree is:: "+height);
        }
    }
}



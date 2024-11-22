package com.practice.DayNine.Practice;

import java.util.Scanner;

class NodeIn {
    int data;
    NodeHigh left,right;

    NodeIn(int data){
        this.data = data;
        this.left =null;
        this.right=null;
    }
}
class BinaryTreeInsert{
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

}
public class InsertOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        BinaryTreeInsert bt  = new BinaryTreeInsert();

        for(int i=0;i<n;i++){
            int data = input.nextInt();
            bt.root = bt.insert(bt.root,data);
        }

        System.out.print("Elements in tree:: ");
        bt.inorder(bt.root);

    }
}


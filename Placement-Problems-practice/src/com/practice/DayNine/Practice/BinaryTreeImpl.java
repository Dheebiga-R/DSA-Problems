package com.practice.DayNine.Practice;

import java.util.Scanner;

class Node{
    int data;
    NodeHigh left,right;

    Node(int data){
        this.data = data;
        this.left =null;
        this.right=null;
    }
}
class BinaryTree{
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

    public void postorder(NodeHigh root) {
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public void preorder(NodeHigh root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

}
public class BinaryTreeImpl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        BinaryTree bt  = new BinaryTree();

        for(int i=0;i<n;i++){
            int data = input.nextInt();
            bt.root = bt.insert(bt.root,data);
        }

        System.out.print("Inorder Traversal ");
        bt.inorder(bt.root);
        System.out.println();
        System.out.print("Postorder Traversal ");
        bt.postorder(bt.root);
        System.out.println();
        System.out.print("Preorder Traversal ");
        bt.preorder(bt.root);
    }
}

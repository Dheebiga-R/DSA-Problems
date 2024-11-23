package com.practice;

import java.util.ArrayList;
import java.util.List;
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
class BinaryTreePath{
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

    public void findAllPaths(Node root, List<Integer> path) {
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            System.out.println(path);
            return;
        }else{
            findAllPaths(root.left,new ArrayList<>(path));
            findAllPaths(root.right,new ArrayList<>(path));
        }

    }

    public void getAllPaths() {
        List<Integer> allPaths = new ArrayList<>();
        findAllPaths(root, allPaths);
    }
}
public class FindPaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        BinaryTreePath bt  = new BinaryTreePath();

        for(int i=0;i<n;i++){
            int data = input.nextInt();
            bt.root = bt.insert(bt.root,data);
        }

        System.out.print("Elements in tree:: ");
        bt.inorder(bt.root);
        System.out.println();
        bt.getAllPaths();
    }

}






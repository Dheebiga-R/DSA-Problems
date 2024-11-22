package com.practice.DayNine.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NodePath {
    int data;
    Node left,right;

    NodePath(int data){
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

    public void findAllPaths(Node root, List<Integer> currentPath, List<List<Integer>> allPaths) {
        if (root == null) {
            return;
        }
        currentPath.add(root.data);

        if (root.left == null && root.right == null) {
            allPaths.add(new ArrayList<>(currentPath));  
        } else {
            findAllPaths(root.left, currentPath, allPaths);
            findAllPaths(root.right, currentPath, allPaths);
        }
        currentPath.remove(currentPath.size() - 1);
    }

    public List<List<Integer>> getAllPaths() {
        List<List<Integer>> allPaths = new ArrayList<>();
        findAllPaths(root, new ArrayList<>(), allPaths);
        return allPaths;
    }
}
public class PathsInBinaryTree {
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

        List<List<Integer>> list = bt.getAllPaths();
        for(List<Integer> ans :list){
            System.out.print(ans+ " ");
        }
    }

}





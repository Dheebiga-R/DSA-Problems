package com.practice.DayNine.Practice;

import java.util.Scanner;

class NodeBin{
    int data;
    NodeBin left,right;

    NodeBin(int data){
        this.data = data;
        this.left =null;
        this.right=null;
    }
}
class BinarySearchImpl{
    NodeBin root;

    public NodeBin insert(NodeBin root, int data) {
        if(root==null){
            root=new NodeBin(data);
            return root;
        }
        if(data<root.data){
            root.left = insert(root.left,data);
        }else if(data>root.data){
            root.right =insert(root.right,data);
        }
        return root;
    }

    public boolean search(NodeBin root, int val) {
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }else if(val<root.data){
            return search(root.left,val);
        }else {
            return search(root.right, val);
        }
    }
}
public class BinarySearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        BinarySearchImpl bt  = new BinarySearchImpl();

        for(int i=0;i<n;i++){
            int data = input.nextInt();
            bt.root = bt.insert(bt.root,data);
        }

        System.out.println("Enter element to search:");
        int val = input.nextInt();

        if(bt.search(bt.root,val)){
            System.out.println("Element "+val+" found in tree");
        }else{
            System.out.println("Element "+val+" not found");
        }
    }
    //Time complexity:O(N)
    //Space complexity:O(N)
}

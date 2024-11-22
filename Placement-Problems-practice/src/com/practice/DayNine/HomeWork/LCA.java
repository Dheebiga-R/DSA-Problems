package com.practice.DayNine.HomeWork;

import java.util.Scanner;

class NodeLCA {
    int data;
    NodeLCA left,right;

    NodeLCA(int data){
        this.data = data;
        this.left =null;
        this.right=null;
    }
}
class BinaryTreeLCA{
    NodeLCA root;

    public NodeLCA insert(NodeLCA root, int data) {
        if(root==null){
            root=new NodeLCA(data);
            return root;
        }
        if(data<root.data){
            root.left = insert(root.left,data);
        }else if(data>root.data){
            root.right =insert(root.right,data);
        }
        return root;
    }

    public void inorder(NodeLCA root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public NodeLCA findLCA(NodeLCA root,int n1,int n2) {
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        NodeLCA leftLCA = findLCA(root.left, n1, n2);
        NodeLCA rightLCA = findLCA(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }
}
public class LCA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        BinaryTreeLCA bt  = new BinaryTreeLCA();

        for(int i=0;i<n;i++){
            int data = input.nextInt();
            bt.root = bt.insert(bt.root,data);
        }

        System.out.print("Elements in tree:: ");
        bt.inorder(bt.root);
        System.out.println();
        System.out.println("Enter first element::");
        int num1 = input.nextInt();
        System.out.println("Enter second element::");
        int num2 = input.nextInt();
        NodeLCA ans = bt.findLCA(bt.root,num1,num2);
        System.out.println("Lowest common ancestor is data:: "+ans.data);
    }
}


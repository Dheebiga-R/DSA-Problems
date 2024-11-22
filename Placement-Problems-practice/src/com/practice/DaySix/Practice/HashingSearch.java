package com.practice.DaySix.Practice;

import java.util.Scanner;

public class HashingSearch {
    private int[] arr;
    private int size;

    public HashingSearch(int size) {
        this.size =size;
        this.arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] =-1;
        }
    }

    private void insert(int key) {
        int index = getIndex(key);
        while(arr[index]!=-1){
            index=(index+1)%size;
        }
        arr[index] = key;
    }

    private int getIndex(int key) {
        return key%size;
    }

    private boolean search(int target) {
        int index = getIndex(target);
        while(arr[index]!=-1){
            if(target==arr[index]){
                return true;
            }
            index= (index+1)%size;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of hash table::");
        int size = input.nextInt();
        System.out.println("Enter the size of elements to insert::");
        int n = input.nextInt();

        HashingSearch hs = new HashingSearch(size);
        System.out.println("Enter the elements::");
        for(int i=0;i<n;i++){
            int key = input.nextInt();
            hs.insert(key);
        }
        System.out.println("Enter the target element::");
        int target = input.nextInt();
        if(hs.search(target)){
            System.out.println("Target element not found::");
        }else{
            System.out.println("Target element found");
        }
    }

}

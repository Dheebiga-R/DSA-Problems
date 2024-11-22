package com.practice.DayFour.Practice;

import java.util.Scanner;

public class MinimumCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount::");
        int amount = input.nextInt();
        System.out.println("Enter the size of an array::");
        int n =input.nextInt();
        System.out.println("Enter array elements::");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int ans = findMinimumCoin(arr,amount);
        if(ans==-1){
            System.out.println("Not possible to make denominations of the amount: "+amount);
        }else{
            System.out.println("Minimum number of coins required to make denomination of amount "+amount+" is: "+ans);
        }
    }

    private static int findMinimumCoin(int[] arr,int target){
        int ans = findMinimumNoOfCoins(arr,target,arr.length-1);
        if(ans>=(int)1e9){
            return -1;
        }
        return ans;
    }
    static int min;
    private static int findMinimumNoOfCoins(int[] arr, int amount, int index) {
        if(amount==0){
            return 0;
        }
        if(index==0){
            if(amount%arr[index]==0){
                return amount/arr[index];
            }else{
                return (int)1e9;
            }
        }
        int notTake = 0 +  findMinimumNoOfCoins(arr, amount, index - 1);
        int take = Integer.MAX_VALUE;
        if(arr[index]<=amount){
            take = 1 + findMinimumNoOfCoins(arr,amount-arr[index],index);
        }
        min=Math.min(take,notTake);
        return min;
    }
    //Time complexity: O(2^N)
    //Space complexity: O(2^N)
}

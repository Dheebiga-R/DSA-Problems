package com.practice.DayFour.Practice;

import java.util.Scanner;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of mate::");
        int n = input.nextInt();
        System.out.println("Enter the ways::");
        int[][] maze = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                maze[i][j] = input.nextInt();
            }
        }
        int[][] sol = new int[n][n];
        if(ispathavailable(maze,sol,0,0)){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(sol[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("No path to reach destination");
        }
    }

    private static boolean ispathavailable(int[][] maze, int[][] sol,int x,int y) {
        if(x==maze.length-1 && y==maze[0].length-1){
            sol[x][y]=1;
            return true;
        }

        if(isSafe(maze,x,y)){
            sol[x][y] =1;
            if(ispathavailable(maze,sol,x+1,y)){
                return true;
            }
            if(ispathavailable(maze,sol,x,y+1)){
                return true;
            }
            sol[x][y] =0;
        }
        return false;
    }

    private static boolean isSafe(int[][] maze, int x, int y) {
        return (x>=0 && x<maze.length && y>=0 && y< maze.length && maze[x][y]==1);
    }
}

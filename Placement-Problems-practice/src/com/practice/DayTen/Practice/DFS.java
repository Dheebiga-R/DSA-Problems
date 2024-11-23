package com.practice.DayTen.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of nodes::");
        int nodes = input.nextInt();
        System.out.println("Enter number of edges::");
        int edges = input.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        System.out.println("Enter source and destination:");
        for(int i=0;i<nodes;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges;i++){
            int src = input.nextInt();
            int dest = input.nextInt();
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        System.out.println("Enter the start node::");
        int startNode = input.nextInt();
        dfs(startNode,adj,nodes);
    }

    private static void dfs(int startNode, List<List<Integer>> adj, int nodes) {
        boolean[] visited = new boolean[nodes];
        Stack<Integer> stack = new Stack<>();
        visited[startNode] =true;
        stack.add(startNode);
        System.out.print(startNode+" ");

        while(!stack.isEmpty()){
            int currentNode = stack.peek();
            boolean foundUnvisited = false;
            for (int neighbor : adj.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                    System.out.print(neighbor + " ");
                    foundUnvisited = true;
                    break;
                }
            }
            if(!foundUnvisited){
                stack.pop();
            }
        }
    }
}

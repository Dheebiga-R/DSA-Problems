package com.practice.DayTen.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetectCycleInDirected {

    private static boolean dfs(int currentNode, List<List<Integer>> adj, boolean[] visited, boolean[] recursionStack) {
        visited[currentNode] = true;
        recursionStack[currentNode] = true;

        for (int neighbor : adj.get(currentNode)) {
            if (recursionStack[neighbor]) {
                return true;
            }
            if (!visited[neighbor] && dfs(neighbor, adj, visited, recursionStack)) {
                return true;
            }
        }

        recursionStack[currentNode] = false;
        return false;
    }

    public static boolean isCyclic(List<List<Integer>> adj, int nodes) {
        boolean[] visited = new boolean[nodes];
        boolean[] recursionStack = new boolean[nodes];

        for (int i = 0; i < nodes; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, recursionStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of nodes::");
        int nodes = input.nextInt();
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < nodes; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter number of edges::");
        int edges = input.nextInt();
        System.out.println("Enter source and destination::");
        for(int i=0;i<edges;i++){
            int src= input.nextInt();
            int dest =input.nextInt();
            adj.get(src).add(dest);
        }

        if (isCyclic(adj, nodes)) {
            System.out.println("Cycle detected in the graph.");
        } else {
            System.out.println("No cycle detected in the graph.");
        }
    }
}

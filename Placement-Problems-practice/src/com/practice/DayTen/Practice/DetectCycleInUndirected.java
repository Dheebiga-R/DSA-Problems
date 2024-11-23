package com.practice.DayTen.Practice;

import java.util.*;

public class DetectCycleInUndirected {
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
        if(detectCycle(startNode,adj,nodes)){
            System.out.println();
            System.out.println("Cycle is detected");
        }else{
            System.out.println();
            System.out.println("Cycle is not detected");
        }
    }

    private static boolean detectCycle(int startNode, List<List<Integer>> adj, int nodes) {
        int[] visited = new int[nodes];
        Arrays.fill(visited, -1);

        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] = 0;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            visited[currentNode] = 1;
            System.out.print(currentNode + " ");

            for (int neighbor : adj.get(currentNode)) {
                if (visited[neighbor] == -1) {
                    visited[neighbor] = 0;
                    queue.add(neighbor);
                }
                else if(visited[neighbor]==0){
                    return true;
                }
            }
        }
        return false;
    }
}

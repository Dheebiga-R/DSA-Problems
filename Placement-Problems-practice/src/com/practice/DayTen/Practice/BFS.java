package com.practice.DayTen.Practice;

import java.util.*;

public class BFS {
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
        bfs(startNode,adj,nodes);
    }

    private static void bfs(int startNode, List<List<Integer>> adj, int nodes) {
        boolean[] visited = new boolean[nodes];

        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] =true;
        queue.add(startNode);

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            System.out.print(currentNode+" ");

            for(int neighbor : adj.get(currentNode)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }

    }
}

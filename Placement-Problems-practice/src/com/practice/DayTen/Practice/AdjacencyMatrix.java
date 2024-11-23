package com.practice.DayTen.Practice;

import java.util.Scanner;
class GraphMat{
    int[][] adj;

    GraphMat(int nodes){
        this.adj = new int[nodes][nodes];
    }

    public void add(int src, int dest) {
        adj[src][dest] = 1;
        adj[dest][src] =1;
    }

    public void displayGraph(int nodes) {
        for(int[] arr:adj){
            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of nodes::");
        int nodes = input.nextInt();
        System.out.println("Enter number of edges::");
        int edges = input.nextInt();

        GraphMat gh = new GraphMat(nodes);
        System.out.println("Enter source and destination:");
        for(int i=0;i<edges;i++){
            int src = input.nextInt();
            int dest = input.nextInt();
            gh.add(src,dest);
        }
        gh.displayGraph(nodes);
    }
}

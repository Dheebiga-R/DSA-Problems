package com.practice.DayTen.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Graph{
    List<List<Integer>> adj;
    Graph(int nodes){
        this.adj = new ArrayList<>();
        for(int i=0;i<nodes;i++){
            this.adj.add(new ArrayList<>());
        }
    }

    public void add(int src, int dest) {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    public void displayGraph(int nodes) {
        for(int i=0;i<nodes;i++){
            System.out.print("Node "+i+":");
            for(int list : adj.get(i)){
                System.out.print(list+" ");
            }
            System.out.println();
        }
    }
}
public class AdjacencyList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of nodes::");
        int nodes = input.nextInt();
        System.out.println("Enter number of edges::");
        int edges = input.nextInt();

        Graph gh = new Graph(nodes);
        System.out.println("Enter source and destination:");
        for(int i=0;i<edges;i++){
            int src = input.nextInt();
            int dest = input.nextInt();
            gh.add(src,dest);
        }
        gh.displayGraph(nodes);
    }
}

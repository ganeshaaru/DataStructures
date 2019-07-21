package com.r.sorting.graph;

import java.util.LinkedList;
import java.util.Stack;

/**
 * link : https://algorithms.tutorialhorizon.com/topological-sort/
 */
public class TopologicalSort {

    static class Graph {
        int vertices;
        LinkedList<Integer>[] adjList;

        public Graph(int vertices) {
            this.vertices = vertices;
            this.adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination) {
            this.adjList[source].addFirst(destination);
        }

        public void topologicalSorting() {
            boolean[] visited = new boolean[this.vertices];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < this.vertices; i++) {
                if (!visited[i]) {
                    topologicalSortUtill(i, visited, stack);
                }

            }

            System.out.println( "Topological sorting");
            int size = stack.size();

            for(int i=0; i< size ; i++){

                System.out.println(stack.pop() + " ");
            }



        }

        private void topologicalSortUtill(int start, boolean[] visited, Stack<Integer> stack) {
            visited[start] = true;
            for (int i = 0; i < adjList[start].size(); i++) {
                int vertex = adjList[start].get(i);
                if(!visited[vertex]){
                    topologicalSortUtill(vertex, visited, stack);
                }
            }

            stack.push(start);
        }
    }

    public static void main(String[] args) {
        int vertices = 8;
        Graph graph = new Graph(vertices);
        graph.addEdge(7, 6);
        graph.addEdge(7, 5);
        graph.addEdge(6, 4);
        graph.addEdge(6, 3);
        graph.addEdge(5, 4);
        graph.addEdge(5, 2);
        graph.addEdge(3, 1);
        graph.addEdge(2, 1);
        graph.addEdge(1, 0);
        graph.topologicalSorting();
    }
}

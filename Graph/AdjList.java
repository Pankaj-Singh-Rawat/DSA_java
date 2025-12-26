package Graph;

import java.util.ArrayList;

public class AdjList {

    static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());// create a list to store neighbouring edges
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v); // directed 

            adj.get(v).add(u); // undirected

        }

        return  adj;
    }

    public static void main(String[] args) {
        int V = 3;

        int[][] edges = {
                {0,1},
                {0,2},
                {1,2}
        };

        ArrayList<ArrayList<Integer>> adj = createGraph(V, edges);

        System.out.println("Adjacency List Representation: ");
        for (int i = 0; i < V; i++) {
            System.out.print(i+ ": ");
            for (int j : adj.get(i)) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

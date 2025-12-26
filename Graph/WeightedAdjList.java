package Graph;

import java.util.ArrayList;

//Here we use edges cause the list can only store a single neighbour, to store multiple neighbour we use Edges(which looks like a single neighbour to ajd list

public class WeightedAdjList {

    static class Edge{
        int target;
        int weight;

        Edge(int target, int weight){
            this.target = target;
            this.weight = weight;
        }
    }
    static ArrayList<ArrayList<Edge>> createGraph(int V, int[][] edges){
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new Edge(v, w));

            adj.get(v).add(new Edge(u, w));
        }


        return adj;
    }

    public static void main(String[] args) {
        int V = 3;
        // {source, destination, weight}
        int[][] edges = {
                {0, 1, 5},
                {0, 2, 10},
                {1, 2, 2}
        };

        ArrayList<ArrayList<Edge>> adj = createGraph(V, edges);

        // Printing the result
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (Edge e : adj.get(i)) {
                // Access the properties of the Edge object
                System.out.print(e.target + "(w:" + e.weight + ") ");
            }
            System.out.println();
        }
    }
}

package Graph;

import java.util.ArrayList;
import java.util.Collections;

public class WeightedAdjMatrix {

    static ArrayList<ArrayList<Integer>> createGraph(int V, int [][] edges){
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            ArrayList<Integer> rows = new ArrayList<>(Collections.nCopies(V,0));
            mat.add(rows);
        }


        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            int w = it[2];
            // Weighted adjacency matrix
            mat.get(u).set(v,w);

            mat.get(v).set(u,w);// for undirected graphs
        }

        return mat;
    }

    public static void main(String[] args) {
        int V = 3;

        int[][] edges = {
                {0, 1, 5},
                {0, 2, 10},
                {1, 2, 2}
        };

        ArrayList<ArrayList<Integer>> mat = createGraph(V, edges);

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Disconnected_Undirected_Graph {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];

        for (int i = 0; i < adj.size(); i++) {
            if( !visited[i]){
                bfsConnected(adj, i, visited, res);
            }

        }
        return res;
    }

    private static void bfsConnected(ArrayList<ArrayList<Integer>> adj, int src, boolean[] visited, ArrayList<Integer> res) {
        Queue<Integer> queue= new LinkedList<>();
        visited[src] = true;
        queue.add(src);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            res.add(curr);

            // visit all the unvisited
            // neighbours of current node
            for (int x : adj.get(curr)) {
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 1, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 2, 0);
        addEdge(adj, 5, 4);

        ArrayList<Integer> res = bfs(adj);

        for(int x : res){
            System.out.print(x + " ");
        }

    }
}

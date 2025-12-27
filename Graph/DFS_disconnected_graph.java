package Graph;

import java.util.ArrayList;

public class DFS_disconnected_graph {

    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        // just run a loop over here
        for (int i = 0; i < adj.size(); i++) {
            // ̵̵and check if it is visited or not
            if (!visited[i]) {
                dfsRec(adj, i, visited, res);
            }
        }

        return res;
    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, int src, boolean[] visited, ArrayList<Integer> res) {
        visited[src] = true;
        res.add(src);

        for (int element : adj.get(src)) {
            if (!visited[element]) {
                dfsRec(adj, element, visited, res);
            }
        }
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

        ArrayList<Integer> res = dfs(adj);

        for (int element : res) {
            System.out.print(element + " ");
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}

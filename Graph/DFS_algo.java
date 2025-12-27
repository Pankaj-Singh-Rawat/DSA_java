package Graph;

import java.util.ArrayList;

public class DFS_algo {

    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        dfsRec(adj, 0, visited, res);
        return res;
    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, int src, boolean[] visited, ArrayList<Integer> res) {
        visited[src] = true;
        res.add(src);

        for(int element : adj.get(src)){
            if(!visited[element]){
                dfsRec(adj, element, visited, res);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 0);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);

        ArrayList<Integer> res = dfs(adj);

        for(int element : res){
            System.out.print(element + " ");
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}

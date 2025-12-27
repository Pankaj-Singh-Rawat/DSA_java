package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
BFS Algo:
1. create a method with an ArrayList as return type
2. then declare variables-
    ArrayList to store result
    Array of Visited Vertices
    Queue(type LinkedList)
    src = 0
3. turn visited at src = true
4. add src to queue
5. while queue is not empty -
    remove head of queue
    add head to src
6. for each neighbour of vertices
7. if any neighbour of vertices is not visited -
    visit it
    add it to queue
 8. end for
 9. end while
 10. return result
 */

public class BFS_undirected {

    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];

        int src = 0;
        visited[src] = true;
        q.add(src);

        while (!q.isEmpty()) {
            int current = q.poll(); // current now stores the head in LinkedList
            res.add(current);

//            check for neighbours
            for (int neighbour : adj.get(current)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return res;
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

        ArrayList<Integer> res = bfs(adj);

        for (int element : res) {
            System.out.print(element + " ");
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int i1) {
        adj.get(i).add(i1);
        adj.get(i1).add(i);
    }

}
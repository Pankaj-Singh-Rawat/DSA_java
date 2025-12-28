package Graph.topologicalSorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Kahn's Algo:
/*
Used for the purpose of TOPOLOGICAL ('u' always comes before 'v') sorting on a Directed acyclic graph (DAG). Even DFS can do that but Kahn's is preferred cuz its intuitive and uses a BFS like approach.

Why?: A course must have has some pre-requisites, so we need to first complete them then only we can complete the given course.
-> We can even say course B depends on course A, hence we must complete course A to move forward to course B.


Kahn's Algo -> Solely relies on In-degree.
In-degree?: Number of incoming edges on a vertex.

Let's talk about Algo: (Steps)
1. Calculate In-degree: for each vertex count how many edges point towards it.
2. Initialise Queue: find vertices with in-degree = 0 add them in queue
3. While Queue is not empty
    pull the head out (temp = queue.poll)
    add u to result
 4. For each neighbour v of u:
    remove the node
    decrement the in-degree of v by 1
    if in-degree of v = 0, add v to queue
5. Check for cycles: if result contains fewer than V nodes, graph has a cycle

Gotcha !

Time Complexity: O(V+E)
 */
public class Kahn_Algo {

    static ArrayList<Integer> kahnAlgo(ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int n = adj.size();
        int[] in_degree = new int[n];

        // computing in-degree
        for (ArrayList<Integer> integers : adj) {
            for (int next : integers) {
                in_degree[next]++;
            }
        }

        for (int i = 0; i < n; i++) {
            if(in_degree[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int temp = q.poll();
            result.add(temp);

            for(int next : adj.get(temp)){
                in_degree[next]--;
                if(in_degree[next] == 0){
                    q.add(next);
                }
            }
        }

        return result;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 1);
        addEdge(adj, 5, 2);

        ArrayList<Integer> result = kahnAlgo(adj);

        for(int element : result){
            System.out.print(element + " ");
        }

    }

}

package Graph.topologicalSorting;

//DFS based topological sort
/*
Now this is how it sounds -> we are gonna use DFS nothing else
And what do we do in DFS?: we use recursion + stacks instead of queues

Let's take a look at it's algo, time complexity will remain same i.e. O(V+E)

Algo:
1. Create a visited array along with a stack
2. loop through all vertices
    if vertex is not yet visited
        call DFS:
3. in DFS:
    mark node as visited
    for each neighbour v of u
    if neighbour not visited
        recursively call DFS
    now push u to stack
4. create result from the stack you created
6. return result

Remember the output for the same graph may result differently cause, each graph can have multiple answers for the same graph

 */

import java.util.ArrayList;
import java.util.Stack;

public class DFS_based_topological_sort {

    static ArrayList<Integer> sortTopo(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                findTopo(i, visited, st, adj);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!st.isEmpty()) {
            result.add(st.pop());
        }

        return result;
    }

    private static void findTopo(int node, boolean[] visited, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                findTopo(neighbour, visited, st, adj);
            }
        }

        st.push(node);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
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

        ArrayList<Integer> result = sortTopo(adj);

        for (int element : result) {
            System.out.print(element + " ");
        }
    }
}

package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
To implement a Graph we will use an Adjacency Matrix

The Adjacency Matrix is a 2D array (matrix) where each cell on index (i,j)
stores information about the edge from vertex i to vertex j.

In case we have a 'sparse' Graph with many vertices, we can save space by using an
Adjacency List compared to using an Adjacency Matrix, because an Adjacency Matrix would
reserve a lot of memory on empty Array elements for edges that don't exist.

*/
public class AdjacencyMatrix {
    // why a static method ?
    // cause it definitely runs for the very first time when the program executes
    static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges){
//        ArrayList is Row and <ArrayList<Integers> is column
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();


        for (int i = 0; i <V; i++) {
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V,0));
/*  Creates a row for vertices
    Collections.nCopies(V,0) -> sets all values to zero by default
 */
            mat.add(row); // adds that row with zeroes to matrix
        } // loop runs V x V times so we have matrix with all values = 0


        for(int[] it: edges){ // it looks like this for first edge-> {0,1)
            int u = it[0]; // now u points to the 0th index i.e. first element in it[]
            int v = it[1]; // and v points to the 1st index in index i.e. 2nd element in it[]

            mat.get(u).set(v,1); // mat  -> at u row and v column set G(u.v) to 1

            // for undirected graphs
            mat.get(v).set(u,1);// mat -> at v row and u column set G(v,u) to 1 also
        }
        return  mat;
    }

    public static void main(String[] args) {

        int V = 3;
         int[][] edges = {
                 {0,1},
                 {0,2},
                 {1,2}
         };

        ArrayList<ArrayList<Integer>> mat = createGraph(V,edges);

        System.out.println("Adjacency Matrix Representation: ");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

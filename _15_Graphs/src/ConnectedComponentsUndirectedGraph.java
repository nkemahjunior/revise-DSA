/**
 *     Given this graph
 *
 *        0 -- 1    4
 *        |       /
 *        3    2     5
 *
 *        the 3 connected components are :
 *       0 = {0, 1, 3}, 1 = {2, 4}, 3 ={5}
 *
 *       so the problem we are trying to solve is:
 *       - count number of connected components
 *       - return true/false when given the query( x, y)... showing whether x and y are connected or not
 */
public class ConnectedComponentsUndirectedGraph {

    // check timestamp for more : 33:37:40 ( around this timestamp, the timestamp is not accurate)

    final AdjacencyGraphLinkedListRepresentation adjacencyGraph;


    public ConnectedComponentsUndirectedGraph(AdjacencyGraphLinkedListRepresentation adjacencyGraph) {
        this.adjacencyGraph = adjacencyGraph;

    }

    void dfsInit(){
        boolean[] visited= new boolean[adjacencyGraph.V];
        int[] componentIDs = new int[adjacencyGraph.V]; // this array will hold particular counts at the index of each vertex. e.g. say index 0, 1, 3 have value as 0 or whatever number, that means they are connected
        int count = 0; // the count that will be stored at various indexes in the componentIDs array


        for(int v = 0; v < adjacencyGraph.V; v++){
            if( !visited[v]){
                dfs(v, visited, componentIDs, count);
                count++;
            }
        }
    }

    void dfs(int v, boolean[] visited, int[] componentIDs, int count){
        visited[v] = true;
        componentIDs[v] = count;

        // looping through the vertices of each linked list at a particular index, v
        for (int w: adjacencyGraph.adj[v]){//for each loop
            if(!visited[w]){
                dfs(w, visited, componentIDs, count);
            }
        }
    }

    /*

     *  the graph
     *        0 -- 1    4
     *        |       /
     *        3    2     5
     *
     *                 the representation of the linked list in the array after creating those edges above
     *

     *            0 |  --> 1 --> 3 --> null  |
     *            1 |  --> 0 -->  null  |
     *            2 |  --> 4 --> null  |
     *            3 |  --> 0 --> null  |
     *            4 |  --> 2 --> null  |

     */


}

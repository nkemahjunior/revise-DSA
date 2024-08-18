import java.util.LinkedList;
import java.util.Queue;

public class BfsTraversalForUndirectedGraphs {
    //bfs = breadth first search
    // level order traversal
     final AdjacencyGraphLinkedListRepresentation adjacencyGraph;

    public BfsTraversalForUndirectedGraphs(AdjacencyGraphLinkedListRepresentation adjacencyGraph) {
        this.adjacencyGraph = adjacencyGraph;
    }


    void bfs(int s){ // s is the starting point from where we will start our bfs

        //since the graph is like a circle, we will need to keep track of the visited vertices.
        boolean[] visited = new boolean[adjacencyGraph.V];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()){

            int u = q.poll();
            System.out.println(u + " ");

            // looping through the vertices of each linked list at a particular index, u
            for(int v : adjacencyGraph.adj[u]){
                if(!visited[v]){
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyGraphLinkedListRepresentation g = new AdjacencyGraphLinkedListRepresentation(4);
        BfsTraversalForUndirectedGraphs bfsGraph = new BfsTraversalForUndirectedGraphs(g);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        //System.out.println(g);
        bfsGraph.bfs(0);
    }

}

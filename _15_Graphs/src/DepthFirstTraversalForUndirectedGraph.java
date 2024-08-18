import java.util.Stack;

public class DepthFirstTraversalForUndirectedGraph {

    final AdjacencyGraphLinkedListRepresentation adjacencyGraph;

    public DepthFirstTraversalForUndirectedGraph(AdjacencyGraphLinkedListRepresentation adjacencyGraph) {
        this.adjacencyGraph = adjacencyGraph;
    }

    void dfs(int s){ // s is the starting point(vertex) for traversal
        boolean[] visited = new boolean[adjacencyGraph.V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while(!stack.isEmpty()){
            int u = stack.pop();

            if( !visited[u]){
                visited[u] = true;
                System.out.println(u + " ");

                // looping through the vertices of each linked list at a particular index, u
                for (int v : adjacencyGraph.adj[u]){ // for each loop
                    if( !visited[v]){
                        stack.push(v);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        AdjacencyGraphLinkedListRepresentation g = new AdjacencyGraphLinkedListRepresentation(4);
        DepthFirstTraversalForUndirectedGraph dfsGraph = new DepthFirstTraversalForUndirectedGraph(g);


        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        dfsGraph.dfs(0);
    }
}

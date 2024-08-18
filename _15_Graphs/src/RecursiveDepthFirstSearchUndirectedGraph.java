public class RecursiveDepthFirstSearchUndirectedGraph {

    final AdjacencyGraphLinkedListRepresentation adjacencyGraph;

    public RecursiveDepthFirstSearchUndirectedGraph(AdjacencyGraphLinkedListRepresentation adjacencyGraph) {
        this.adjacencyGraph = adjacencyGraph;
    }

    void recursiveDfs(){

        boolean[] visited = new boolean[adjacencyGraph.V];


        //here we will use a starting point( source ) as we did in the iterative version since we have some unconnected vertices.
        // this loop will help visit unconnected nodes e.g 5
        for(int v =0 ; v < adjacencyGraph.V;  v++){
            if( !visited[v]) recursiveDfsMain(v, visited);
        }

    }

     void recursiveDfsMain(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v + " ");

        // looping through the vertices of each linked list at a particular index, v
        for(int w : adjacencyGraph.adj[v]){//for each loop
            if( !visited[w]){
                recursiveDfsMain(w, visited);
            }
        }

    }


    public static void main(String[] args) {

        AdjacencyGraphLinkedListRepresentation g = new AdjacencyGraphLinkedListRepresentation(6);
        RecursiveDepthFirstSearchUndirectedGraph dfsGraph = new RecursiveDepthFirstSearchUndirectedGraph(g);


        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(4,2);

        dfsGraph.recursiveDfs();




        /*

         *  the graph.. 5 is unconnected
         *                 0 -- 1
         *                 |    |   4
         *                 3 -- 2 /      5
         *
         *                 the representation of the linked list in the array after creating those edges above
         *

         *            0 |  --> 1 --> 3 --> null  |
         *            1 |  --> 0 --> 2 --> null  |
         *            2 |  --> 1 --> 3 --> 4 null  |
         *            3 |  --> 2 --> 0 --> null  |
                      4 | -->  2
                      5 | no connected notes

         */
    }
}


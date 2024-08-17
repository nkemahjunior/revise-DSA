import java.util.Arrays;

public class AdjacencyGraph {
    // also called undirected graph

    int [][] adjMatrix;
    private int V; // number of vertices in graph
    private  int E; //number of edges in the graph

    public AdjacencyGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v){

        // since its an undirected graph, we need to connect it at two places e.g. given this graph 1 --- 2,  we say 1 is connected to 2 and 2 is connected to 1
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;

        E++;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(V + " vertices, "+ E + " edges " + "\n" );

        for (int v = 0; v < V; v++){
            sb.append( v + ": ");

            for (int w : adjMatrix[v]){
                sb.append(w + " ");
            }
            sb.append(" \n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        AdjacencyGraph g = new AdjacencyGraph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println(g);

        /**
         * check readme.md file for more info
         *
         *  the graph
         *                 0 -- 1
         *                 |    |
         *                 3 -- 2
         *
         *                 the representation on the matrix
         *
         *                0   1   2   3
         *               __________________
         *            0 | 0    1   0   1   |
         *            1 | 1    0   1   0   |
         *            2 | 0    1   0   1   |
         *            3 | 1    0   1   0   |
         *               ___________________
         */
    }
}

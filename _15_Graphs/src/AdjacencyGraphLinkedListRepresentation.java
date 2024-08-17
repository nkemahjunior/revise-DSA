import java.util.LinkedList;

public class AdjacencyGraphLinkedListRepresentation {

    // another way to represent adjacency graphs is using an array of linked list

    LinkedList<Integer> [] adj;

    private int V; // number of vertices in graph
    private  int E; //number of edges in the graph



    public AdjacencyGraphLinkedListRepresentation(int nodes) {
        this.adj = new LinkedList[nodes];

        // assigning the indexes of the array to empty linked list objects
        for( int i = 0; i < nodes; i++)
            this.adj[i] = new LinkedList<>();

        this.V = nodes;
        this.E = 0;

    }

    void addEdge(int u, int v){
        this.adj[u].add(v);
        this.adj[v].add(u);

        E++;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(V + " vertices, "+ E + " edges " + "\n" );

        for (int v = 0; v < V; v++){
            sb.append( v + ": ");

            for (int w : adj[v]){
                sb.append(w + " ");
            }
            sb.append(" \n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        AdjacencyGraphLinkedListRepresentation g = new AdjacencyGraphLinkedListRepresentation(4);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println(g);

        /*

         *  the graph
         *                 0 -- 1
         *                 |    |
         *                 3 -- 2
         *
         *                 the representation of the linked list in the array after creating those edges above
         *

         *            0 |  --> 1 --> 3 --> null  |
         *            1 |  --> 0 --> 2 --> null  |
         *            2 |  --> 1 --> 3 --> null  |
         *            3 |  --> 2 --> 0 --> null  |

         */
    }
}

# Graph
- This is a non-linear data structure used for storing data
- it is a set of vertices and a collection of edges that connects a pair of vertices
- in this example 1, 2, 3, 4, 5 are the vertex of graph and each line connecting them is called as edge
 

                              vertex--> 1 -> 2   
                                \       | \    \  
                                  \    |    \   5
                                   \   3 --  4 /

# Applications
- used in social networks such as Twitter, facebook

# Adjacency Matrix (Undirected Graphs)
- e.g. the graph above is an undirected graph. Undirected graphs have no directions on their edges
- we can represent them using multidimensional matrices

### Example 
 given this graph 
       
                0 -- 1
                |    |
                3 -- 2
we can represent it using this 2 by 2 matrix. On the matrix, 1 (one) means there is an edge between two vertices
and 0(zero) means the opposite e.g. if you check 3 and 2 on the matrix, you will see 1, meaning there is edge
between them.  
this is the general representation to show there is an edge : 
                  
                   1
             row ---- col

                0   1   2   3
              __________________
           0 | 0    1   0   1   |
           1 | 1    0   1   0   |
           2 | 0    1   0   1   |
           3 | 1    0   1   0   |
              ___________________
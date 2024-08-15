# Priority Queue and Binary Heap

## Priority Queue

Priority queue is a data structure that allows us to find minimum/maximum  element among a collection of 
elements in constant time. it supports the following operations :
- insert(key) - insert key into the priority queue
- deleteMax()/ deleteMin() - return and remove largest/ smallest key
- getMax()/getMin() - return largest/smallest key

## Binary heap
This is the data structure that helps us in implementing priority queue operations efficiently. A binary 
heap is a complete binary tree in which each node value >= or <= than the values of its children.

                                             0
                                         /       \
                                       7           3
                                     /   \        /  \
                                    9     8      5    6
                                                           
                                             Min heap    

                                             9
                                         /       \
                                       3           6
                                     /   \        /  \
                                    2     1      5    4
                                                           
                                             Max heap                
A complete binary tree is one in which all levels are completely filled except last level and last level has
nodes in such a way that left side is never empty e.g.

                                             9
                                         /       \
                                       3           6
                                     /   \        /  
                                    2     1      5    
                                                           
                                             Complete Binary tree             

                                             9
                                         /       \
                                       3           6
                                         \        /  \
                                          1      5    4
                                                           
                                             INcomplete binary tree

## Representation of Binary heap
- implemented using arrays
- first entry of array is taken as empty
- as binary heaps are complete binary trees, the values are stored in array by traversing tree
level by level from left to right.

### Example
lets see how this binary heap will be stored in an array, remember we store nothing at index 0

                                             0
                                         /       \
                                       7           3
                                     /   \        /  \
                                    9     8      5    6

                                      [\ , 0, 7, 3, 9, 8, 5, 6]

- To calculate the the location of the children for a particular node, use these formulas:
Children of k index = 2*k, 2*k + 1
e.g. children of node at index 3 = 2*3 = 6 and 2*3+1 = 7... so the children of the node found at index 3 
are found at index 6 and 7 respectively.

- To calculate the location of the parent for a node at k index, use this formula :
 Parent of k index = k/2.... remember integer division


## Bottom up Reheapify Max heap (swim)
A max heap is a complete binary tree in which each node value is >= than the value of its children. But after inserting an element into 
a heap, it may not satisfy the above property. Thus we perform bottom up reheapify technique, in which we adjust the locations of 
elements to satisfy heap property.

### Example: went we insert 10 into this binary heap, the heap does not satisfy the condition of a MAX heap
                                             9
                                         /       \
                                       3           6
                                     /   \        /  \
                                    2     1      5    4
                                   /
                                  10
- we would need to arrange the heap so that 10 is right at the top.



## Top down Reheapify Max heap (sink)
After deleting an element from heap, it may not satisfy heap properties. Thus, we perform top-down reheapify technique, in which 
we adjust the locations of elements to satisfy heap property.

### Example
 deleteMax() in this tree.. and the max is 9.  To delete, we swap 9 and the last element in the array which will be 4. Then we can
safely remove 9. we're doing this so we don't end up with an incomplete binary tree.

                                             9
                                         /       \
                                       3           6
                                     /   \        /  \
                                    2     1      5    4



                                              4
                                         /       \
                                       3           6
                                     /   \        /  \
                                    2     1      5    9



                                              4
                                         /       \
                                       3           6
                                     /   \        /  
                                    2     1      5    

okay so we have deleted 9,  but our tree does not satisfy the properties of a max heap , because look at where 4 is, 4 is smaller
than one of its children (6)... 
To put 4 in its correct position : 
- compare its children ( 3 and 6), and 6 is greater
- we compare 4 and 6, 6 is greater, so we swap their positions
- we keep repeating this process until 4 is at the right position.
- our tree finally looks like this

                                              6
                                         /       \
                                       3           5
                                     /   \        /  
                                    2     1      4    

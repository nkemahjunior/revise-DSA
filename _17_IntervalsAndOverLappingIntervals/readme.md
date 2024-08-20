# Intervals and overlapping intervals

- An interval is a range represented by two numbers like (5, 8).
- The two numbers are termed as **start** and **end**
- They are always in time units like seconds, milliseconds etc.

### Example 
 lets represent this intervals : 
 a => (1, 3), b => (4, 5), c => (8, 10) and d => (9, 11)
  
      let me draw this crooked graph
  
 ````
       0      1      2       3      4       5       6       7        8      9       10      11
    ---|------|------|------ |------|-------|-------|-------|--------|------|-------|--------|------> time axis
              [       1,3    ]      [ 4, 5  ]                         [      8, 10  ]
                       a                b                                     c
                                                                             [     9, 11     ]
                                                                                     d
                                                                                     
okay, so the intervals have been represented on our graph
 ````

# Overlapping Intervals

Relationship between two intervals ( a, b).  // note that, there can be many intervals e.g a, b, c
````
- a and b do not overlap   [ a ] [ b ]. here a was (1, 3) and b = (4, 5). so they do not overlap

- a and b overlap, b ends after a. e.g  [    a    ]
                                           [      b   ],  where a = (1, 4), and b = (3, 6)

- a completely overlaps b.  e.g   [            a       ]
                                        [  b ],    where a = (1, 6) and b = ( 2, 4)
 
- a and b overlaps, a ends after b. e.g       [  a   ]
                                           [  b ]          
     
- b completely overlaps a. e.g    [  a   ]
                               [     b         ]   , a = (2, 4)  and b = (1, 6)
              
- b and a do not overlap = [ b ]  [ a ]               
  

````
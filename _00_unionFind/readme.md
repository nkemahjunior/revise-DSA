
# UNION FIND (UF)

## The problem
  Given a set of N objects
- Union Command : connects two objects
- Find/connected query: is there a path connecting the two objects

## Modelling the connections : properties of connected objects
We assume "is connected to" is an equivalence relation: 
- Reflexive: p is connected to p
- Symmetric: if p is connected to q, then q is connected to p
- Transitive: if p is connected to q and q is connected to r, then p is connected to r

## Example
    Given the set/components of objects; each object in a particular set are connected to each other
    {0} {1, 4, 5} {2, 3, 6, 7}
    
    connected(0,1) = false
    connected(1, 5) = true

 Remember the union command connects two objects e.g
- union(2, 5), the sets now become {0} {1, 4, 5, 2, 3, 6, 7}

## Approaches to solving the Union find problem :
- ### Quick Find ( eager approach)
  - #### Data structure
    - integer array id[] of sie N
    - interpretation: p and q are connected iff they have the same id value
    - the objects are the **indexes** of the array
    - e.g int[] id = {0,1,1,8,8,0,0,1,8,8} , indexes of this array are 0,1,2,3...9
    - id[6] = 0, id[1] = 1, so 6 and 1 are not connected since they have different id values. Remember, the objects are the indexes of the array
  - #### Union
    - To merge components containing p and q, change all entries whose id value equals id[p] to id[q]
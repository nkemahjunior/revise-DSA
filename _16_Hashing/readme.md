
### The problem

searching methods such as linear search require us to keep comparing each element with the key until it is
found or not found. While binary search does not require us to check each element since we keep halving the array,
but we need to sort the array first.
The time complexity of a linear search is O(n) while that of binary search is O(log n).

But is there any searching method which have a time complexity of O(1) ?
- we could search the array using indexes e.g. array[4] // get element at index 4. but what if we want to
store large numbers such as id card numbers, we will need a huge array. Also, the memory of most of the array
elements will remain un utilized and wasted
- Hash tables

# Hashing and Hash tables
- Hashing is a technique used for storing, retrieving and removing information as quick as possible
- it's the process of converting an arbitrary size key into fixed size value. The conversion is done via
  special function called as hash function
- The operations supported by hashing such as storing, retrieving and removing information have average runtime
  complexity of O(1).

# Hash Functions
There are many, but we are going to look at the modular hash function
### Modular hash functions
- A modular hash function simply takes a key and size, returns remainder by dividing key by size
- The remainder is used as an index to store the key in an array of provided size

### Example
```` 
here is our key space which contains the keys we want to store = ( 5, 1, 10, 26, 99)

index = hashFunction(key) = key % size, let size be = 10

5 % 10 = 5
1 % 10 = 1
10 % 10 = 0
26 % 10 = 6
99 % 10 = 9

we store each key(element) at its index - the remainder gotten from dividing the key by the size

        [ 10   1               5   26          99 ]
indexes =  0   1   2   3   4   5   6   7   8   9   

when we want to search a key, we simply pass it to that hash function and it returns the index where its found
````
# Hash Table
- it is a generalized form of an array
- it stores the data in form of key-value pairs
- it converts key to index using a hash function
- Taking the index, we store key-value in an array
- The primary operations supported by HashTable are :
  - put(key, value)
  - get(key)
  - remove(key)
- it has an average running time of O(1)
- Java collection framework has the HashMap class- if we want to deal with key-value pair and HashSet class if
we want to deal only with keys.

## Collision Resolution ( using separate chaining)
There are times when we will get collisions when trying to create the indexes. we solve this collision problem
using separate chaining where colliding elements are stored in a list. Normally the hash table always stores
the elements( keys or key-value) in hash nodes, there are just like the nodes of linked lists. in case of any
collision, the colliding element is just added to the list

### Example
```` 
here is our key space which contains the keys we want to store = ( 
        5, john 
        1, tom
        10, mary
        105, dinho
        )

index = hashFunction(key) = key % size, let size be = 10

5 % 10 = 5
1 % 10 = 1
10 % 10 = 0
105 % 10 = 5


we store each key-value(element) at its index - the remainder gotten from dividing the key by the size

          0[]--> [10| "mary" ] --> null 
          1[]--> [1 | "tom"  ] --> null
          2[]
          3[]
          4[]
          5[]--> [5 | "john" ] --> [105 | "dinho" ] --> null 
          6[]
          7[]
          8[]
          9[]
 
 all this brackets ( [] from index 0 to 9) are called buckets
 
so a hash node consists o 3 things :
  - a key
  - the value
  - next
````
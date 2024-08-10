# Data structures and algorithms
###### Reference( Youtube- free code camp): https://www.youtube.com/watch?v=2ZLl8GAk1X4&t=2646s

## Types of data structures
- ### Linear Data structures
Data is stored sequentially e.g array, queues, linked list, stacks, queues

- ### Non linear Data structures
Data is not stored sequentially. Data here is always stored in multi levels e.g trees, graphs

## Analysis of Algorithms

- ### Time Complexity
The time it takes to complete an algorithm

- ### Space Complexity
The amount of memory taken by an algorithm

- ### Asymptotic Analysis of an Algorithm
Asymptotic analysis helps in evaluating the performance of an algorithm in terms of input size and its increase. 
it helps in determining how time and space taken by algorithm increases with input sized

- ### Asymptotic notations
Asymptotic notations help us determine the best, average and worst case. There are three notations for performing
runtime analysis of an algorithm... 

1. _**Omega notation**_ : it is the formal way to express the **lower bound** of an algorithm's running time. Lower bound means for any given input
this notation determines best( lowest ) amount of time an algorithm can take to complete e.g say a certain algorithm takes 100secs
as best amount of time. So, 100 secs will be the lower bound of that algorithm. The algorithm can take more than 100 secs
but it will not take less than 100 secs. <br><br>

2. _**Big O notation**_ : It is the formal way to express the **upper bound** of an algorithm. It determines the longest
amount of time( worst case) of an algorithm. e.g if we say an algorithm takes 100 secs as the longest time. So 100 secs 
will be the upper bound of that algorithm. The algorithm can take less than 100 secs but it can not take more. This 
is the mostly used notation.<br><br>

3. _**Theta Notation**_: it is the formal way to express both the upper and lower bound of an algorithm's running time.
So it determines the average amount of time an algorithm can take to complete. e.g if an algorithm takes 5, 10, 15 secs
on the 1st, 2nd, 3rd runs respectively.. the theta notation will give the average of running that algorithm.


## Rules of Big O(o) Notation
- Assume a single processor which performs sequential execution of statements
- Assignment operations take 1 unit (constant) of time e.g x = 5
- Same for return statements e.g return y
- same for logical operations e.g x && y
- same for accessing a variable e.g getting value of x
- other small/single operations takes 1 unit of time
- Drop lower order terms
- Drop constant multipliers 
- Assume 'n' is too large
- e.g The time of an algorithm, T = 3n² + 6n + 1 
- by dropping the lower order terms ( e.g 6n and 1) and constant terms( e.g 3, 6, 1) we get a big O notation of **O(n²)**<br><br>

### Example 1 : Time complexity of a constant algorithm
````
1   public int sum(int x, int y ){
2       int result = x + y;
3       return result;
4   }
````
line no 1: we access the value of x and y which will take 1 unit of time to access each so 2 units of time.
line no 1: we do an arithmetic operation on x and y which takes 1 unit of time.
line no 1: we do assignment of x + y to the variable result which takes 1 unit of time

line no 2: we access the value of result, which takes one unit of time.
line no 2 we do a return statement which takes 1 unit of time.

so in the total time, T = 4 + 2 = 6..  so T == C (constant)
so Time complexity = **O(1)**

### Example 2 : Time complexity of a Linear algorithm
````
1   public int sum(int n ){
2       int sum = 0;
3       for(int i= 1; i <= n ; i++){
4           sum = sum + i ; // n steps
5       }
6       return sum;
7   }
````
line no 2: we do an assignment, **so 1 unit**<br>
line no 3: we do an assignment i.e i = 1, so 1 unit<br>
line no 3: we access variable i, we access variable n, then we do a logical operation so that's 3 units... But it's a 
**for loop**. Lets say the value of n which we will pass to the function is 3... then we will access variable i , n and 
do the logical operation 4 times. This is how it will happen:
- at i = 1 , we do the above 3 operations, then increment i to 2 ( at i++)
- at i = 2, we do the above 3 operations, then increment i to 3
- at i = 3,  we do the above 3 operations, then increment i to 4,
- at i = 4 , we do the above 3 conditions but we stop, since the condition failed i.e i <= n
- so we accessed i, n and did the logical operation **4 times**..... so that means when we provide the value **n**, those
three operations will execute **n + 1 times** ( i.e n was 3 and we did those operations 4 times, so n + 1)
- so the units will be 3( n + 1) ... 3, because  we access variable i, we access variable n, then we do a logical operation so that's 3 units
<br>
line no 3: we access the value of i, do an arithmetic operation, then assign it back to i, so that's 3 units... say n = 3
- the first time i executes to go to 2
- the second time, i executes to go to 3,
- the third time, i executes to go to 4, and loop fails
- so for value n , i++ will execute n times, so the units will be 3n<br><br>
- **so the final units for line 3 will be: 1 + 3(n + 1) + 3n = 1 + 3n + 3 + 3n = 6n + 4**
<br><br>
- **line no 4: we access i, sum, do an addition, and do and assignment, so that's 4 units, but it's a for loop, so n times**
- **so, n(1 + 1 + 1 + 1) = n(4) = 4n**
<br><br>
line no 6: **we access sum, we do a return statement so that's 2 units**
<br><br>
- so the final time for the algorithm, T = 1 + 6n + 4 + 4n + 2
- T = 10n + 7, removing lower order terms( 7 in this case) and constant terms ( 10)
- **T = n , so T = O(n)**

### Example  : Time complexity of a Polynomial algorithm
````
    public void print(int n){
        for(...)
            for(...)
                ....
       sout(" finishhhh")
    }
````
- do the calculations, and the time for the algorithm, T = O(n²)


# Check the notes of each data structure in its package
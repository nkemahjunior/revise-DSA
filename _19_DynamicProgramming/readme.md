# Dynamic Programming
It is a technique in which a complex problem is solved by :
- Breaking it into smaller sub problems
- Solving those sub problems and simply storing their results
- Re-use those stored results if the sub problems occurs/overlaps again. (so we avoid solving sub problems again)
- Using solutions to smaller problems build up solutions to complex problem

### Example, Explained by Jonathan Paulson on Quora
- if I write 1 + 1 + 1 + 1 + 1 =  ? on a sheet of paper
- to get the answer, we need to take time to add all those numbers
- Finally, we get the answer 5
- what if I add another + 1 to the question
- **immediately we know the answer is 6**
- how did you know ? because we had already calculated the other problems, and we still remember the answer (5), so
 we just added 1 to it, and we got the **answer 6**. We did not need to recount all the 1's
- So dynamic programming is just a fancy way to say remembering stuff to save time later!

## Dynamic Programming and Recursion
- it is mainly an optimization over recursion
- Dynamic programming = Recursion + Memorization

### Characteristics for dynamic programming
- **Optimal Sub structure**<br>
     A given problem has an optimal sub structure property if an optimal solution of the given problem
    can be  obtained by using the optimal solution of its sub problems.
    e.g Fibonacci(n) = Fibonacci(n - 1) + fib(n - 2)


- **Overlapping sub problems**<br>
 A given problem has an overlapping sub problem property if the solution of the given problem is
 obtained by solving same sub problems multiple times
 e.g Fibonacci(n) = Fibonacci(n - 1) + Fibonacci(n -2)


### Approaches to solving a dynamic problem
- **Bottom Up Approach**
    - we try to solve smaller sub problems first, use their solution to build on and arrive at solutions
      to bigger sub problems
    - it is also called Tabulation method
    - The solution is build in a tabular form by using solutions of smaller sub problems iteratively
       and generating solutions to bigger sub problems ( check the Fibonacci class to see the codes)
  
- **Top-down Approach**
    - it is also called as Memoization
    - we break the large problem into multiple sub problems
    - Each of the sub problems are solved and solutions are remembered
    - If the sub problem is solved already, reuse the answer
    - Else solve the sub problem and store the result
    - Thus, it memorizes the solution of the sub problem to avoid recomputing the value if the sub problem is
    encountered again.

     
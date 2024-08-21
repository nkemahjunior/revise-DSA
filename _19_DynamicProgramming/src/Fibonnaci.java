/**
 * FIBONACCI
 *
 * it is a series of numbers in which the first two numbers are 0 and 1. After that each number is the sum of the two preceding numbers .
 * @Example 0, 1, 2, 3, 5, 8, 13, 21, ...
 *   fib(0) = 0
 *   fib(1) = 1
 *   fib(n) = fib(n-1) + fib(n-2)
 *
 *   QUESTION: find the nth fibonacci number
 */
public class Fibonnaci {

   // not efficient since we keep recalculating all the values, so lets use dynamic programming
   /* int fib(int n){

        //base cases
        if( n == 0 ) return  0;
        if( n == 1) return 1;

        int left = fib(n-1);
        int right = fib(n - 2);
        return left + right;
    }*/

    //efficient, dynamic programming bottom up approach
    // here we start at the bottom going up
   /* int fib(int n){

        //store results of the smaller sub problems
        int[] table = new int[ n + 1];

        table[0] = 0;
        table[1] = 1;

        for(int i = 2; i<= n; i++){
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }*/

    //efficient, dynamic programming top-down approach
    // here we start at the top going down
    static  int fib(int[] memo, int n){

        //execute only if we have not already calculated stored the value of n
        if(memo[n] == 0){
            // this if block will take care of storing the fibonacci values of 0 and 1
            if(n < 2){
                memo[n] = n;
            }
            else{
                int left = fib(memo, n - 1);
                int right = fib(memo, n - 2);
                memo[n] = left + right;
            }

        }

        return  memo[n];
    }

    public static void main(String[] args) {
        int ans = fib(new int[6 + 1], 6);
        System.out.println("the sixth fibonacci number is = " + ans);
    }


}

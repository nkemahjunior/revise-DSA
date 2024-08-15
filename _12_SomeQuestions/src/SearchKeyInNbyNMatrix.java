public class SearchKeyInNbyNMatrix {


    /***
     * Given a SORTED n * n array... search for a given key, k
     *
     * EXAMPLE:  say the array is 4 * 4 and looks like this
     *       0     1      2      3
     *     -------------------------
     *  0 |  10    20    30     40  |
     *  1 |  15    25    35     45  |
     *  2 |  27    29    37     48  |
     *  3 |  32    33    39     51  |
     *     -----------------------
     *
     * SOLUTION 1
     *      we could use a double FOR-LOOP and check each element of the key against the array, but this is efficient since it will be 0(n²)
     *
     *  SOLUTION 2
     *      since the array is sorted, some properties hold true for the array
     *      1) for each number, X , the numbers to the left are smaller than X and vice versa for those on the right
     *      2) for each number, X , the numbers to the top are smaller than it and vice versa for those to the bottom of the number
     *
     *      - using these properties we will use two pointers ( this is the norm with multidimensional arrays' boy ) i and j
     *      - we will place i at the rows and j at the columns
     *      - i at row 0 BUT we will start at J at the last column, column 3
     *      - at each step, we will compare them array[i][j] ?= key, if yes, FOUND
     *      - if no we check if array[i][j] > key, if true j-- i.e. we move j forward
     *      - else i ++, i.e. move i downward
     *
     *      array[rows][columns]... e.g array[1][3] = 40
     *
     * ****/

    public static void searchKey(int[][] arr, int x, int n){
        //n is size of array, x is the key

        int i = 0;
        int j = n -1;
        while( i < n && j >= 0){

            if( arr[i][j] == x ){
                System.out.println( "key found at arr[" + i +"]" + "[" + j + "]" );
                return; // key is found
            }

            if( arr[i][j] > x )  j-- ;
            else  i ++;
        }

        System.out.println("key not found");
    }

    public static void main(String[] args) {

        int [][]  arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 51}
        };

        searchKey(arr, 32, 4);

    }
}

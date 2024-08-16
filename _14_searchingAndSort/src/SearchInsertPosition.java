public class SearchInsertPosition {

    /**
     * QUESTION
     *
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     * The algorithm should run in O( log n ) time
     *
     * EXAMPLE
     *
     * input = [1, 3, 5, 7] , target = 5......  output = 2
     *
     * input = [1, 3, 5, 7] , target = 2......  output = 1... meaning 2 was supposed to be at position two after one
     *
     * input = [1, 3, 5, 7] , target = 8......  output = 4... meaning 8 was supposed to be at position 4 after seven
     * **/

   /*they said the algorithm should be O(log n) not O(n) as in this for loop.. so lets do a new solution using binary search
    public static int searchInsertPosition( int[] arr, int target){
        int max = target;

        for( int i = 0; i < arr.length; i++){

            if( arr[i] == target ) return i;
            if( arr[i] > max  ) return i;
        }
        return arr.length;
    }*/

    public static int searchInsertPosition( int[] arr, int target){

        //this algorithm run in log n time because at each step we are reducing the size of the array

        int lo = 0;
        int hi = arr.length - 1;

        while( lo <= hi){
            int mid = lo + ( hi - lo) / 2 ;

            if( target == mid) return mid;

            if( target > arr[mid]) lo = mid + 1;
            else hi = mid - 1;
        }

        /***
         * if we did not see the target, then lo will return the index of where the element was supposed to be found.
         * */
        return lo;
    }

    public static void main(String[] args) {

        int ans = searchInsertPosition( new int[]{1, 3, 5, 7}, 20);
        System.out.println(ans);
    }
}

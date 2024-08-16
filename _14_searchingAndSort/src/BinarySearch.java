public class BinarySearch {

    /**
     * # Binary search
     *
     * ## Goal
     * - Given a sorted array and a key , find index of the key in the array
     *
     * ## Procedure for binary search
     * - compare the key against the middle entry.
     * - Too small, go left
     * - Too big, go right
     * - Keep repeating same process until the key is found
     *
     * ## Example
     * ````
     * search for key=33 from this array:
     *
     * `6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97`
     *
     *
     * step 1: lo = 6 and hi=97, mid = 53.... key is less than 53, so we go left of 53
     * step 2: lo = 6 and hi= 51, mid = 25.... key is greater than 25, so we go right of 25
     * step 3: lo = 33 and hi = 51, mid = 43... key is less than 43, so we go left of 43
     * step 4: lo=33 and hi = 33, mid = 33, key is found
     * ````
     * */

    public static  int  binarySearch(int[] a, int key){

        int lo = 0, hi = a.length;

        while( lo <= hi){
            int mid = lo + (hi - lo)/2;

            if(key < a[mid]) hi = mid - 1;
            else if( key > a[mid]) lo = mid + 1;

            else return mid;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = {6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97};
        int key = 33;

        var results = binarySearch(a, key);

        System.out.println(results);
    }
}



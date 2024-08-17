import java.util.Arrays;

/**
 * Given an integer array sorted in ascending order, return an array of the squares of each number sorted in ascending order.
 *
 * @Example input = [-4, -1, 0, 3, 10] output = [0, 1, 9, 16, 100]
 * Explanation: after squaring, the array becomes [16, 1, 0, 9, 100]... after sorting, it becomes [0, 1, 9, 16, 100]
 */
public class SquaresOfSortedArray {

    static void solution(int[] arr){
        int [] results = new int[arr.length];

        int i=0, j = arr.length - 1;

        for( int k = arr.length - 1; k >= 0; k--){

            /**
             * since we are working on a sorted array, that means it we keep comparing the squares of the elements at the lowest and highest index, we will get a number which is larger
             * than all the other squares in between them
             * @Example say at a particular stage the lowest = -9 and highest is 10, then in between them, we have 7... obviously the square of -9 or 10 is larger than 7, so we can place
             * the larger square at th end.. that's why we are filling the array backwards and coming up
             */
            if( Math.abs(arr[i]) > Math.abs(arr[j]) ) {
                results[k] = arr[i] * arr[i]; // remember k is starting from the end of the array
                i++;
            }else {
                results[k] = arr[j] * arr[j];
                j--;
            }
        }

        System.out.println(Arrays.toString(results));
    }

    public static void main(String[] args) {
        solution(new int[]{-4, -1, 0, 3, 10});
    }
}

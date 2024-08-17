import java.util.Arrays;

/**
 * Given an array of 0's, 1's, 2's, sort the array in O(n)
 *
 * @Example  input = [0, 0, 1, 2, 0, 0, 1, 2]   output = [0, 0, 0, 1, 1, 2, 2]
 */
public class DutchNationalFlagProblem {

    static  void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void dutchSort(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;

            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        dutchSort(new int[]{0, 0, 1, 2, 0, 0, 1, 2});
    }
}

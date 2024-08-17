import java.util.Arrays;

/**
 * MERGE SORT
 * this is a divide and conquer algorithm.
 *
 * DIVIDE : in this step, the algorithm takes the middle point of an array and divides the array into 2 halves. The algorithm is carried out
 * recursively for half arrays until there are no more half arrays to divide.
 *
 * CONQUER : in this step starting from the bottom, we sort and merge the divided arrays and get the sorted array.
 *
 * @Example lets sort this array = [2, 10, 5, 3, 6, 4, 11]
 * -lets start dividing until we are left with single elements in the array
 * After that, we start comparing the single arrays and merging them
 *
 *                                                              [2, 10, 5, 3, 6, 4, 11]
 *                                                              /                      \
 *                                                  [2, 10, 5, 3]                      [ 6, 4, 11]
 *                                                  /           \                     /           \
 *                                          [2, 10]               [5, 3]          [6, 4]         [11]
 *                                         /      \              /     \          /    \          |
 *     //finish dividing                [2]       [10]         [5]    [3]       [6]    [4]       [11]
 *                                      \          /           \       /         \      /          |
 * //start conquering and merging back     [2,10]                [3, 5]            [4, 6]         [11]
 *                                           \                    /                   \             /
 *                                                [2, 3, 5, 10]                          [4, 6, 11]
 *                                                         \                               /
 *                                                          \                            /
 *                     //finally sorted                         [2, 3, 4, 5, 6, 10, 11]
 */
public class MergeSort {

    public static  void mergeSort(int[] arr, int[] temp , int low, int high){

        if( low < high){// base case

            int mid = low + ( high - low )/2;

            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void merge(int[] arr, int[] temp, int low, int mid, int high){

        for(int i = low; i<= high; i++){
            temp[i] = arr[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        //swapping between the mini array
        while( i <= mid && j <= high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // copy remaining elements to the array after one part of the arrays are finished
        while( i <= mid){
            arr[k] = temp[i];
            i++;
            k++;
        }

    }

    public static void main(String[] args) {

        int [] arr = {2, 10, 5, 3, 6, 4, 11};
        mergeSort(arr, new int[arr.length], 0, arr.length-1);
    }
}

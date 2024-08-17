import java.util.Arrays;

/**
 * QUICK SORT
 * this is a divide and conquer algorithm. It involves 3 steps :
 * 1) PIVOT SELECTION: we pick an element and mark it as pivot. The pivot element can be first element, last element or any random element.
 *
 * 2) PARTITIONING: we reorder the array such that all elements greater than pivot comes after the pivot and all elements smaller than pivot comes before the pivot. The
 * elements equal to pivot can go either side of the pivot. After this partitioning, the pivot is at its CORRECT SORTED POSITION.
 *
 * 3) RECURSION: Recursively apply the above steps on the subarray formed to the left side of pivot and on the subarray formed on the right side of the pivot
 */
public class QuickSort {


    static int[] quickSort(int[] arr, int low, int high){

        if( low < high){
            int pivotPosition = partioning(arr, low, high);
            quickSort(arr, low, pivotPosition - 1); //left subarray
            quickSort(arr, pivotPosition + 1, high); // right subarray
        }

        return arr;
    }

    static int partioning(int[] arr, int low, int high){

        int pivot = arr[high]; // pivot could be any value in the array
        int i = low;
        int j = low;

        while( i <= high){

            if( arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

            i++;
        }

        return j-1; // the final index of the pivot after partitioning the array
    }

    public static void main(String[] args) {

        int [] arr = {2, 10, 5, 3, 6, 4, 11};

        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }

}

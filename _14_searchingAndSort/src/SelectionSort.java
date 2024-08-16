import java.util.Arrays;

/**
 * SELECTION SORT
 * here,w e divide the array into two parts: sorted and unsorted. At the beginning we have NO ELEMENT in the sorted part, unlike bubble sort where we assume the first
 * element is sorted at the beginning.
 *
 * The algorithm sorts an array by repeatedly finding the minimum element in an unsorted array and making it part of the sorted array.
 *
 * From the unsorted part, we pick the minimum element and swap it with the leftmost element of the unsorted part i.e. the first element of the unsorted part. After
 * swap, that element now becomes part of the sorted array.
 *
 * we repeat this process until the unsorted array is empty
 */
public class SelectionSort {


    public static void sort(int[] arr){

        for( int i = 0; i < arr.length - 1; i++){

            int min = i;
            for (int k = i + 1; k < arr.length; k++){

                if( arr[k] < arr[min] ){
                    min = k;
                }

            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        sort(new int[] {3 , 1, 5, 2, 6, 4});
    }
}

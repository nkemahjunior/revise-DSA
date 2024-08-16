import java.util.Arrays;

public class MergeTwoSortedArrays {

    // given two sorted arrays, merge them into a new array and it should be sorted


    public static void mergeTwoSorted(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0; // i will be the pointer for arr1, j for arr2 and k for results array. we will keep on comparing the
        // elements at i and j, and increase the pointer(i or j) of the smallest element by 1 (i++ or j++)

        while(i < arr1.length && j < arr2.length){
            if( arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }else{
                result[k] = arr2[j];
                j++;
            }

            k++;
        }

        // after this while loop above either i or j will be greater than the length of their array
        //if its j, this first while loop will run, and we will just copy the remaining elements from arr1  and add to the results array
        //if its i, the second while loop will run, and we will just copy the remaining elements from arr2 and add to the results array

        while (i < arr1.length){
            result[k] = arr1[i];
            i++; k++;
        }


        while (j < arr2.length){
            result[k] = arr2[j];
            j++; k++;
        }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        mergeTwoSorted(new int[]{4,5,7,8},new int[]{1, 6, 10, 12} );
    }
}

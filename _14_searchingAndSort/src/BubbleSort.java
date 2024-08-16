import java.util.Arrays;

/**
 Bubble sort also known as sinking sort

 - while applying this sorting algorithm on an UNSORTED array, the largest elements tend to sink at the end of the array.
 - it repeatedly compares a pair of adjacent element and swap them if they are in the wrong oder
 - at the end of each swapping phase the largest element is being pushed at the end of the array, then we reduce the sie of the array
 - we can use a swap variable to keep track of when the array is finally sorted

 @Example let's sort this array = [3, 1, 5, 2, 6, 4]
 phase 1: after sorting, the array will end like this : [1, 3, 2, 5, 4, 6]
 the largest element is at the end of the array.  so we reduce the array size by 1, meaning we will sort only [1, 3, 2, 5, 4] in the next phase

 phase 2: after sorting this array [1, 3, 2, 5, 4, 6], we end up with [1, 2, 3, 4, 5, 6]
 we reduced the array again , meaning we will sort only [1, 2, 3, 4] in the next phase

 */
public class BubbleSort {


    public static int[] bubbleSort(int[] arr){
        //boolean swap = true;
        int swap = 1;
        int i =0;
        int j = 1;
        int arrSize = arr.length;

        int phase = 0;

        // you could also use two for loops
        while ( j < arrSize  ){

            if( arr[i] > arr[j]){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                swap++;
            }

            i++;
            j++;

            if( j == arrSize){
                phase++;
                System.out.println( " phase "+phase +" : " +Arrays.toString(arr));

                // end of the array and we did not swap ? break
                if( swap == 1) break;

                //reset variables for a new swapping phase
                i = 0;
                j = 1;
                arrSize--;
                swap = 1;
            }
        }

        return arr;

    }

    //The teacher's version
  /*  public static int[] bubbleSort(int[] arr){
        boolean swapped = false;

        for ( int i = 0 ; i < arr.length-1; i++){
            for(int j= 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }

        return arr;
    }*/

    public static void main(String[] args) {

        int[] ans = bubbleSort(new int[]{3, 1, 5, 2, 6, 4});
        System.out.println(Arrays.toString(ans));
    }

}

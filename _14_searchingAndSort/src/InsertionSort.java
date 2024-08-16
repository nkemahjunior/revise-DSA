import java.util.Arrays;

/**
 * INSERTION SORT
 * <p>
 * simple sorting algorithm that works the way we sort playing cards in our hands.
 * in insertion sort, we divide the given array into two parts : SORTED part and UNSORTED part
 * From unsorted part, we take first element and place at its correct position in the sorted part. This is done by shifting all elements which are larger than the
 * first element  by one position
 *
 * it is repeated until unsorted array is empty
 *
 *  @Example let's sort this array = [3, 1, 5, 2, 6, 4]
 * when we start, we assume that the element at the first position is already sorted, so we start from the second element
 * sorted = [ 3 |   1, 5, 2, 6, 4]
 *   <-- sorted     unsorted -->
 *
 *  next , we take the first element in the unsorted part and store in a temp variable and free its space. so the array will look like this
 *
 *    sorted = [ 3 |   null, 5, 2, 6, 4], temp = 1
 *     <-- sorted     unsorted -->
 *
 *   compare temp with the elements in the sorted part and shift all elements greater than temp in the sorted part by one position, so 3 will come back and take the position of null
 *
 *    sorted = [ 1, 3 |  5, 2, 6, 4], temp = 1
 *       <-- sorted     unsorted -->
 *
 *   next, temp = 5... we empty the space where 5 was stored. Then we compare 5 and 3, 5 is larger, so no need shifting the elements by 1 position. after sorting, array looks like this
 *   sorted = [ 1, 3, 5 | 2, 6, 4]
 *      <-- sorted     unsorted -->
 *
 *  next, temp = 2... we empty the space where 2 was stored. Then we compare 2 and 5, 5 is larger, so we shift the elements(5) by 1 position... the array will be like this
 *       sorted = [ 1, 3, 5 |  null, 6, 4], temp = 2
 *              <-- sorted     unsorted -->
 *
 *       sorted = [ 1, 3, null, 5  | 6, 4], temp = 2
 *                    <-- sorted     unsorted -->
 *
 *    temp is still smaller than the next element in the sorted part, 3... so we shift 3 one position
 *       sorted = [ 1, null, 3, 5  | 6, 4], temp = 2
 *                    <-- sorted     unsorted -->
 *
 *    temp is smaller than 1, so we insert temp
 *       sorted = [ 1, 2, 3, 5  | 6, 4]
 *                 <-- sorted     unsorted -->
 *    we continue repeating this process for elements in the sorted and unsorted part
 */
public class InsertionSort {

    public static void sort(int [] arr){

        //starting at 1, because we assume element at index 0 is already sorted
        for (int i = 1; i < arr.length; i++){

            int temp = arr[i];
            int j = i - 1;// points to the last element in the sorted part... we will update this variable in the while loop

            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j]; // shifting element in the unsorted part, one position forward
                j = j - 1;
            }

            arr[j+1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        sort(new int[]{3 , 1, 5, 2, 6, 4});
    }
}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {






    //inefficient, this method will exceed the time limit for large k values
    /*public static void rotateInefficient(int[] nums, int k) {

        if(k == 0) return ;

        int lastElement = nums[nums.length-1];

        for( int i = nums.length - 1; i >= 1; i--){
            nums[i] = nums[i - 1];
        }
        nums[0] = lastElement;

        System.out.println(Arrays.toString(nums));
       rotateInefficient(nums, k-1);
       //return arr;
    }*/

    static void rotate(int[] nums, int k){

        k = k % nums.length; // to handle cases where k is large than n
        //EFFICIENT METHOD
        //EXAMPLE: rotate this array = [1, 2, 3, 4, 5, 6, 7] by k rotations where K = 3

        //SOLUTION
        //STEP 1: reverse the entire array : [7, 6, 5, 4, 3, 2, 1]
        //STEP 2: reverse the first K elements: [5, 6, 7, 4, 3, 2, 1]
        //STEP 3: reverse the remaining n - k elements, n is the array length : [5, 6, 7, 1, 2, 3, 4]

        //reverse the whole array
        reverse(nums, 0, nums.length - 1);

        //reverse k elements
        reverse(nums, 0, k-1);

        //reverse the remaining n - k elements, n is the array length
        reverse(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }



    static void reverse(int [] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        //rotate(new int[]{1,2,3,4,5,6,7}, 3);
        //rotate(new int[]{1,2}, 3);
        //reverse(new int[]{1,2,3}, 2);
        rotate(new int[]{1, 2}, 3);
    }
}

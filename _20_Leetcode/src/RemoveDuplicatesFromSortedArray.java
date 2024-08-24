import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * Return k after placing the final result in the first k slots of nums.
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

 * Example 1:
 * Input: nums = [1,1,1,2,2,3]
 * Output: 5, nums = [1,1,2,2,3,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 * Input: nums = [0,0,1,1,1,1,2,3,3]
 * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
 * Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class RemoveDuplicatesFromSortedArray {

    static int removeDuplicates(int[] nums){

        //starting at 2 since the maximum duplicates should be 2 and the array is already sorted, so no need to arrange the first two elements
        int j = 2;

        for(int i = 2; i < nums.length; i++){
            if( nums[i] != nums[j - 2]){
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return j;
    }

    public static void main(String[] args) {
        //int ans = removeDuplicates(new int[]{1,1,1,2,2,3});
        int ans = removeDuplicates(new int[]{0,0,0,0,0,1,2,2,3,3,4,4});
        //int ans = removeDuplicates(new int[]{1,1,});
        System.out.println(ans);
    }
}

/**
 *
 System.out.println(" ");
 System.out.println("start ");
 System.out.println( " i = "+i +  " j = "+j +  " k = "+k + " seen = "+seen);
 System.out.println(Arrays.toString(arr));




 System.out.println(" ");
 System.out.println("At the end ");
 System.out.println( " i = "+i +  " j = "+j +  " k = "+k + " seen = "+seen);
 System.out.println(Arrays.toString(arr));
 */
/**
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.
 * Example 2:
 *
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * Explanation: No triplet exists.
 * Example 3:
 *
 * Input: nums = [2,1,5,0,4,6]
 * Output: true
 * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 */
public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {

        /***
         * The algorithm relies on the fact that if there is an increasing triplet in the array, there must be two values, a and b,
         * such that a < b. The algorithm keeps track of the two smallest values encountered (a and b). If it finds an element greater
         * than both a and b, it means there is an increasing triplet.
         */

        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[] {1,5,0}));
    }
}

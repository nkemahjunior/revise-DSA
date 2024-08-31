/**
 * LEETCODE 209
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray
 *  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 *
 *
 *
 * Example 1:
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 *
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 *
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */
public class MinimumSizeSubArraySum {


    public int minSubArrayLen(int target, int[] nums) {
        //we will use the sliding window technique
        //https://www.geeksforgeeks.org/window-sliding-technique/


        // check for edge case
        if (nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int sum = 0;
        int curlen = 0;
        int ans = Integer.MAX_VALUE;
        int left = 0;

        for(int i = 0; i < n; i++){
            sum = sum + nums[i];

            while( sum >= target){
                curlen = i - left + 1;
                sum = sum - nums[left];
                ans = Math.min(ans,curlen);
                left++;
            }


        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }


}

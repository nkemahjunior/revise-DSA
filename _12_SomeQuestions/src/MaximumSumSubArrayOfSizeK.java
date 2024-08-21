/**
 * given an array of integers arr, there is a sliding window of size k, which is moving from the very left of the array to the very right. You can see
 * k numbers in the window each time the sliding window moves right by one position. Return the maximum sum of any contagious sub array of size k
 *
 * @Example input = arr = [2, 7, 3, 5, 8, 1], k = 3
 *         output = [77, 77, 88, 88]
 *
 *         EXPLANATION: here is how we got the output
 *
 *            window position ( represented using brackets)                       Max
 *            [ (2, 7, 3), 5, 8, 1 ]                                               12
 *            [ 2, (7, 3, 5), 8, 1 ]                                               15
 *            [ 2, 7, (3, 5, 8), 1 ]                                               16
 *            [  2, 7, 3, (5, 8, 1) ]                                              14
 *
 */
public class MaximumSumSubArrayOfSizeK {

    int maxSubArraySum(int[] arr, int k){

        int maxSum = 0;
        int windowSum = 0;
        int start = 0;

        for(int end = 0; end < arr.length; end++){
            windowSum = windowSum + arr[end];

            if( end >= k - 1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - arr[start];
                start++;
            }
        }

        return maxSum;
    }
}

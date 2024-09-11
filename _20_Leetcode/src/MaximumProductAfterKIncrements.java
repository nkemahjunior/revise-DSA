import java.util.PriorityQueue;

/**
 * 2233. Maximum Product After K Increments
 * Medium
 * Topics
 * Companies
 * Hint
 * You are given an array of non-negative integers nums and an integer k. In one operation, you may choose any element from nums and increment it by 1.
 *
 * Return the maximum product of nums after at most k operations. Since the answer may be very large, return it modulo 10^9 + 7.
 * Note that you should maximize the product before taking the modulo.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,4], k = 5
 * Output: 20
 * Explanation: Increment the first number 5 times.
 * Now nums = [5, 4], with a product of 5 * 4 = 20.
 * It can be shown that 20 is maximum product possible, so we return 20.
 * Note that there may be other ways to increment nums to have the maximum product.
 * Example 2:
 *
 * Input: nums = [6,3,3,2], k = 2
 * Output: 216
 * Explanation: Increment the second number 1 time and increment the fourth number 1 time.
 * Now nums = [6, 4, 3, 3], with a product of 6 * 4 * 3 * 3 = 216.
 * It can be shown that 216 is maximum product possible, so we return 216.
 * Note that there may be other ways to increment nums to have the maximum product.
 */
public class MaximumProductAfterKIncrements {


    public int maximumProduct(int[] nums, int k) {
        // Min-heap (priority queue) to get the smallest element efficiently
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all elements to the min-heap
        for (int num : nums) {
            minHeap.offer(num);
        }

        // Perform k increments
        for (int i = 0; i < k; i++) {
            // Extract the smallest element
            int smallest = minHeap.poll();
            // Increment the smallest element by 1
            smallest++;
            // Push it back to the heap
            minHeap.offer(smallest);
        }


        final int MOD = 1_000_000_007; //10^9 + 7
        // Calculate the product of the elements in the heap
        long product = 1;
        while (!minHeap.isEmpty()) {
            product = (product * minHeap.poll()) % MOD;
        }

        return (int) product;
    }
}

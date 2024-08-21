/**
 * KADANE's ALGORITHM FOR MAXIMUM SUM SUB ARRAY
 *
 * Given an array arr[] of size N. The task is to find the sum of the CONTAGIOUS sub-array within an arr[] with the largest sum.
 *
 * @Example input =  arr = {-2, -3, 4, -1, -2, 1, 5, -3}
 *               output = 7
 *         EXPLANATION : the max sub array is [ 4, -1, -2, 1, 5 ] and their sum is 7
 *
 * @Example input = {2}
 *          output = 2
 *          EXPLANATION : the max sub array is [2] and their sum is 2
 *
 * @Example input = {5, 4, 1, 7, 8}
 *             output = 25
 *             EXPLANATION : the max sub array is [ 5, 4, 1, 7, 8 ] and their sum is 25
 *
 * @Example input = {4, 3, -2, 6, -12, 7, -1, 6}
 *             output = 25
 *             EXPLANATION : the max sub array is [ 5, 4, 1, 7, 8 ] and their sum is 25
 *
 *       SOLUTION
 *       - we keep track of two variables
 *       - we will traverse through the array and at each stage, each element will ask themselves two questions :
 *            1- should I become part of current sub-array  OR
 *            2- should I start a new sub-array
 *            - and from these two questions they will pick the best option, best option is the option that creates a larger sum
 *
 *   OKAY, LET'S DO THE LAST EXAMPLE
 *
*    element     Ask question                                                                                                                currentMax               maxSoFar/Best sum
*     4        become part since sum will be 4                                                                                               4                        [4] = 4
*     3        become part, since currentMax + 3 = 7, instead of starting a new sub-array where the sum will 3                               4, 3 = 7                [4, 3] = 7
*    -2       become part, since currentMax + -2 = 5, instead of starting a new sub-array where the sum will -2                              4, 3, -2 = 5            don't add -2 since it will reduce maxSoFar
*    6        become part, since currentMax + 6 = 11, instead of starting a new sub-array where the sum will 6                               4, 3, -2, 6  = 11        [4, 3, -2, 6] = 11
*   -12       become part, since currentMax + -12 = -1, instead of starting a new sub-array where the sum will -12 ( -1 is bigger than -12)  4, 3, -2, 6, -12 = -1    don't add -12 since it will reduce maxSoFar
*   7        start new sub-array since 7 is greater than adding currentMax + 7 = 6                                                           7                        7 < maxSoFar, so maxSoFar remains the same
*   -1       become part, since currentMax + -1 = 6, instead of starting a new sub-array where the sum will -1                               7, -1  = 6               6 < maxSoFar, so maxSoFar remains the same
*   6        become part, since currentMax + 6 = 12, instead of starting a new sub-array where the sum will -6                               7, -1, 6 = 12            12 > maxSoFar, this is our new maxSoFar
 *    NO MORE ELEMENTS, RETURN SUM OF MAX SO FAR
 *
 */
public class KadaneAlgorithmForMaxSumSubArray {

    static int maxSubArray(int[] arr){

        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for(int i = 1; i <arr.length; i++){
            currentMax = currentMax + arr[i];

            if(currentMax < arr[i] ){
                currentMax = arr[i];
            }

            if(maxSoFar < currentMax){
                maxSoFar = currentMax;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{4, 3, -2, 6, -12, 7, -1, 6}));
    }
}

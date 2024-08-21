import java.util.Arrays;

/**
 * Given an array of distinct integers, print all such triplets such that they add up to a specific target. The triplet should be ordered in ascending order
 *
 * @Example input =[2, 4, 3, 7, 1, ,8, 9, 0], target = 6
 *
 * output = {0, 2, 4}, {1, 2, 3}
 */
public class PrintTriplets {

    void threeSum(int[] arr, int target){
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++){
            int j = i + 1;
            int k = arr.length - 1;

            while( j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    System.out.println(arr[i]  + ", " + arr[j] + ", "+ arr[k]);
                    j++;
                    k--;

                } else if (sum < target) {
                    j++;
                }else {
                    k--;
                }
            }
        }
    }
}

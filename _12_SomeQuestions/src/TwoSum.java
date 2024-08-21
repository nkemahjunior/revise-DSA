import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target
 * @Example  input =  [2, 11, 5, 10, 7, 8], target = 9
 *        output = 0, 4
 *        EXPLANATION
 *        arr[0] + arr[4] = 2 + 7 = 9
 *
 *
 *        Implementation
 *        a + b = c
 *
 *        a = c - b
 *        b = c - a
 */
public class TwoSum {

    //instead of using the brute force algorithm for this problem, which will have a time complexity of O(n²), we can use a hash map
    static int[] twoSumA(int[] arr, int target){

        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        //Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            if(!map.containsKey(target - arr[i]))
                map.put(arr[i], i);
            else{
                result[1] = i; //storing first index in results
                result[0] = map.get(target - arr[i]); //retrieving and storing second index in results
                return result;
            }
        }
        return result;
    }


    //method 2
    static int[] twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        int[] result = new int[2];

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;

            } else if ( sum < target) {
                left++;
            }else {
                right++;
            }
        }

        return result;
    }
}

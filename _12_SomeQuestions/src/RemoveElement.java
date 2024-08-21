/**
 * Given an integer array nums and an integer value, remove all occurrences of value in nums in place. The order of the elements may be changed. Then
 * return the number of elements in nums that are not equal to value
 *
 * @Example input = [3, 2, 2, 3], value = 3
 *    output: 2, [2, 2] //we also need to remove all occurrences of VALUE from the array
 *    EXPLANATION: 2 numbers (2 and 2) in the array are not equal to 3
 */
public class RemoveElement {

    int removeElement(int[] nums, int val){
        int i = 0;

        for(int j =0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

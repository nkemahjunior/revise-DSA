/**
 * Given an integer array sorted in descending order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in the array
 *
 * @Example  input = [1, 1, 2]
 * output = 2, [1, 2, _]
 */
public class RemoveDuplicatesFromSortedArray {

    int removeDuplicates(int[] nums){
        int i = 1;

        // starting at the second position, since the first element is at the right position, so no need to try and remove it
        // remember array is sorted, so we check adjacent elements to check for duplicates
        for(int j =1; j < nums.length; j++){

            //we have found a unique element
            if( nums[i - 1] != nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}

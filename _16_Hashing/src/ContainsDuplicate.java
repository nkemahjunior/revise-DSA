import java.util.HashSet;
import java.util.Set;

/**
 * given an integer array nums, return true if any value appears at least twice in the array and return false if every element is distinct
 * @Example input = [1,2,3,4,1] output = true
 *        input = [1,2,3,4,5] output = false
 *
 *        //solutions
 *        - linear search with brute force, not really efficient O(n²)
 *        - sort array and check the neighbouring elements, not really efficient, O(log n)
 *        - use a set, time complexity becomes O(n) since we still use a for loop and the space complexity will also increase since we are using an additional data structure
 */
public class ContainsDuplicate {

    static  boolean containsDuplicate(int [] nums){
        //HashSet<Integer> test = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for( int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) return true;

            set.add(nums[i]);
        }
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,1}));
    }
}

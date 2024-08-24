import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
 *
 * Since the result may be very large, so you need to return a string instead of an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,2]
 * Output: "210"
 * Example 2:
 *
 * Input: nums = [3,30,34,5,9]
 * Output: "9534330"
 */
public class LargestNumber {

    public static String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];
        for(int i =0; i < arr.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

       // Arrays.sort(arr,(a, b) -> (b +""+a).compareTo(a+""+b));

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String n1 = o1 + o2;
                String n2 = o2 + o1;

                return n2.compareTo(n1);
            }
        });

        if(Objects.equals(arr[0], "0")) return "0";

        StringBuilder sb = new StringBuilder();
        for(String el: arr) sb.append(el);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[] {3,30,34,5,9})); //9534330"
       // System.out.println(largestNumber(new int[] {10, 2})); //"210"
    }

}

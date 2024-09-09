import java.util.Arrays;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 */
public class ReverseInteger {

    public static int reverse(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;



        while( i < j){
            if(arr[i] == '-' ) {
                i++;
                continue;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        String result = "";
        for(char el : arr){
            result = result + el;
        }


        long ans = Long.parseLong(result);
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;

        return Integer.parseInt(result);

    }

    public static void main(String[] args) {
        System.out.println( reverse(1073741824));
       // System.out.println(1073741824);

    }
}

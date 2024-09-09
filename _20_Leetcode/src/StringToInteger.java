/**
 * mplement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Whitespace: Ignore any leading whitespace (" ").
 * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
 * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
 * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
 * Return the integer as the final result.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "42"
 *
 * Output: 42
 *
 * Explanation:
 *
 * The underlined characters are what is read in and the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "42" ("42" is read in)
 */
public class StringToInteger {
    public static int myAtoi(String s) {
        //INCOMPLETE

        char[] arr = s.toCharArray();
        String result = "";

        for(int i = 0; i < arr.length; i++){

            //ignore leading white space
            if(i == 0 && arr[i] == ' ') continue;

            //encountered a non digit
            if( !Character.isDigit(arr[i]) ) {
                if( i == 0 && arr[i] != '-') return 0;

                if(i > 0) break;
            }

            result = result + arr[i];
        }

        long ans = Long.parseLong(result);

        if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" -042"));
    }
}

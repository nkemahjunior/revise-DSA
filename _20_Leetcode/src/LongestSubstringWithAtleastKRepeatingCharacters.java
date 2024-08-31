import java.util.HashMap;
import java.util.Map;

/**
 * LEETCODE 395
 * Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each character in this substring is greater than or equal to k.
 *
 * if no such substring exists, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aaabb", k = 3
 * Output: 3
 * Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
 * Example 2:
 *
 * Input: s = "ababbc", k = 2
 * Output: 5
 * Explanation: The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 *
 */
public class LongestSubstringWithAtleastKRepeatingCharacters {

    //INCOMPLETE
    public static int longestSubstring(String s, int k) {

        if(s.length() == 1) return s.length();

        Map<Character, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        int longestLength = 0;

        while (end < s.length()){

            if( !map.containsKey(s.charAt(end))){
                map.put(s.charAt(end), 1);

            }else{
                int curKey = map.get(s.charAt(end));
                map.put(s.charAt(end), curKey+1);

                if(curKey + 1 >= k){
                    int curLength = end - start + 1;
                    longestLength = Math.max(longestLength, curLength);
                }
            }



            end++;
        }

        return longestLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("a",3));
    }


}

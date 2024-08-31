import java.util.HashSet;
import java.util.Set;

/**
 * LEETCODE 3
 *
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 *
 *
 *
 * SOLUTION  //https://prepfortech.io/leetcode-solutions/longest-substring-without-repeating-characters
 * <p>We initialize an empty set seen to keep track of the characters we have already seen, and start at the beginning of
 * the string with the start of the window set to 0. We also initialize the maximum length of the substring seen so far to 0.</p>
 * <p>We then loop through the string, with end as the index of the end of the window. We add the character at the end of the window to
 * the set seen, and update the maximum length of the substring seen so far if necessary.</p>
 * <p>If the character at the end of the window is already in seen, we remove the first character of the substring (at the start of the window)
 * from seen and move the start of the window forward. We repeat this until the character at the end of the window is not in seen anymore.</p>
 * <p>Finally, we return the maximum length of the substring seen so far.</p>
 */
public class LongestStringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {


        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int longestLength = 0;

        while(end < s.length()){

            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                int curLen = end - start + 1;
                longestLength = Math.max(longestLength, curLen);
                end++;

            }else{
                set.remove(s.charAt(start));
                start++;

            }

        }

        return longestLength;
    }


    /**
     * MORE EFFICIENT
     *static int lengthOfLongestSubstring(String s){
     *
     *         Map<Character, Integer> map = new HashMap<>();
     *         int maxLength = 0;
     *         int start = 0;
     *
     *         for( int end = 0; end < s.length(); end++){
     *
     *             char rightChar = s.charAt(end);
     *
     *             if(map.containsKey(rightChar)){
     *                 start = Math.max(start, map.get(rightChar) + 1);
     *             }
     *
     *             map.put(rightChar, end);
     *             maxLength = Math.max(maxLength, end - start + 1);
     *         }
     *
     *         return maxLength;
     *     }
     * */

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbbb"));
    }

}

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string str, find the length of longest substring without repeating characters
 * @Example input = str = "abcabcbb"
 *          output = 3
 *
 * @Example input = str = "bbbb"
 *  *          output = 1

 * @Example input = str = "pwwkew"
 *          output = 3
 */
public class LongestSubtringWithoutRepeatingCharacters {


    int lenghtOfLongestSubstring(String s){

        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for( int end = 0; end < s.length(); end++){

            char rightChar = s.charAt(end);

            if(map.containsKey(rightChar)){
                start = Math.max(start, map.get(rightChar) + 1);
            }

            map.put(rightChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

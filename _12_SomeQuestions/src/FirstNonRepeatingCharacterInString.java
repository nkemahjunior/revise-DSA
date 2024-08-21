import java.util.HashMap;
import java.util.Map;

/**
 * QUESTION: given a string s, return the index of first non-repeating character in it . if it does not exist return -1. The string will
 * only contain lower case letters
 *
 * @Example  str = "codeforcode"
 *      output = 4
 *
 *      EXPLANATION: the first non repeating character is 'f' found at index 4
 */
public class FirstNonRepeatingCharacterInString {

    int firstNonRepeatingCharacter(String str){

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for(char ch: chars){
            // remember a map replaces the old key - value if we try to insert the same key
            // so when we will try to insert repeating characters, their old value of 1 will be replaced to 2
            // non repeating characters will end up having a value of 1, since we will encounter them only once in a string
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        for(int i =0; i < chars.length; i++){
            char ch = chars[i];
            if(map.get(ch) == 1){
                return i;
            }
        }

        return -1;
    }
}

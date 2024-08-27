import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 *
 *
 * Approach ( FROM LEETCODE- user: niits)
 * I'll show you two ways to solve this quesiton.
 *
 * Solution 1
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Simply, if we can sort each character of each string, we can group them.
 *
 * "eat"   →   "aet"
 * "tea"   →   "aet"
 * "tan"   →   "ant"
 * "ate"   →   "aet"
 * "nat"   →   "ant"
 * "bat"   →   "abt"
 *
 * "aet": ["eat", "tea", "ate"]
 * "ant": ["tan", "nat"]
 * "bat": ["abt"]
 * We can create 3 groups with "aet", "ant" and "abt".
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word: strs){
            char[] wordArr = word.toCharArray();

            Arrays.sort(wordArr);
            String key = new String(wordArr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println( groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}

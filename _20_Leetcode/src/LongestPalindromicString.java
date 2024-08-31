import java.util.Arrays;

/**
 *Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicString {


    public String longestPalindrome(String s) {

        int maxLength = 0;
        String maxString = "";

        for(int i = 0; i < s.length(); i++){

            String oddWord = expandFromMiddle(s, i, i);
            String rightWord = expandFromMiddle(s, i, i + 1);

            if(oddWord.length() > maxLength){
                maxLength = oddWord.length();
                maxString = oddWord;
            }

            if(rightWord.length() > maxLength){
                maxLength = rightWord.length();
                maxString = rightWord;
            }
        }

        return maxString;

    }


    public static String expandFromMiddle(String s, int left, int right){

        while( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        System.out.println( "madam".compareTo("damma"));
    }


}
